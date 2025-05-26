package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
// @NoArgsConstructor // Removed due to conflict with manual constructor
// @AllArgsConstructor // Removed due to conflict with manual constructor or if not working
public class EmpLog {
    private Integer id; //ID
    private Integer operateEmpId; // 操作人ID
    private String operateEmpName; // 操作人姓名
    private LocalDateTime operateTime; // 操作时间
    private String className; // 类名
    private String methodName; // 方法名
    private String methodParams; // 方法请求参数
    private String returnValue; // 返回值
    private Long costTime; // 执行耗时, 单位ms

    // Manually added no-args constructor
    public EmpLog() {
    }

    // Manually added all-args constructor
    public EmpLog(Integer id, Integer operateEmpId, String operateEmpName, LocalDateTime operateTime,
                  String className, String methodName, String methodParams, String returnValue, Long costTime) {
        this.id = id;
        this.operateEmpId = operateEmpId;
        this.operateEmpName = operateEmpName;
        this.operateTime = operateTime;
        this.className = className;
        this.methodName = methodName;
        this.methodParams = methodParams;
        this.returnValue = returnValue;
        this.costTime = costTime;
    }

    // Manually added getters and setters due to Lombok issues
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperateEmpId() {
        return operateEmpId;
    }

    public void setOperateEmpId(Integer operateEmpId) {
        this.operateEmpId = operateEmpId;
    }

    public String getOperateEmpName() {
        return operateEmpName;
    }

    public void setOperateEmpName(String operateEmpName) {
        this.operateEmpName = operateEmpName;
    }

    public LocalDateTime getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(LocalDateTime operateTime) {
        this.operateTime = operateTime;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodParams() {
        return methodParams;
    }

    public void setMethodParams(String methodParams) {
        this.methodParams = methodParams;
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue;
    }

    public Long getCostTime() {
        return costTime;
    }

    public void setCostTime(Long costTime) {
        this.costTime = costTime;
    }
}
