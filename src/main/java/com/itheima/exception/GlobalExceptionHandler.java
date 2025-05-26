package com.itheima.exception;

import com.itheima.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order; // 可以用来指定处理器的顺序
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理部门非空异常
     * @param e DeptNotEmptyException
     * @return Result
     */
    @ExceptionHandler(DeptNotEmptyException.class)
    @Order(1) // 确保这个处理器优先于通用的 ExceptionHandler
    public Result handleDeptNotEmptyException(DeptNotEmptyException e) {
        log.warn("部门删除校验失败: {}", e.getMessage()); // 使用 warn 级别可能更合适
        return Result.error(e.getMessage()); // 直接返回异常中的消息
    }

    /**
     * 处理数据库键重复异常
     * @param e DuplicateKeyException
     * @return Result
     */
    @ExceptionHandler(DuplicateKeyException.class)
    @Order(2)
    public Result handleDuplicateKeyException(DuplicateKeyException e){
        log.error("数据库操作唯一键冲突:", e); // 记录详细错误
        String message = e.getMessage();
        // 尝试从错误信息中提取有用的部分，这部分比较脆弱，依赖于具体数据库的错误信息格式
        if (message != null && message.contains("Duplicate entry")) {
            int i = message.indexOf("Duplicate entry");
            String errMsgPart = message.substring(i);
            String[] arr = errMsgPart.split("'"); // 通常重复的值在单引号之间
            if (arr.length > 1) {
                return Result.error("数据 '" + arr[1] + "' 已存在，请勿重复添加。");
            }
        }
        return Result.error("数据已存在，请检查输入。");
    }

    /**
     * 处理其他所有未捕获的异常
     * @param e Exception
     * @return Result
     */
    @ExceptionHandler(Exception.class)
    @Order(100) // 通用处理器顺序靠后
    public Result handleException(Exception e){
        log.error("系统发生未捕获异常:", e); // 记录详细错误
        // 对于生产环境，不应将原始异常信息直接暴露给前端
        return Result.error("系统繁忙，请稍后重试或联系管理员。");
    }
}
