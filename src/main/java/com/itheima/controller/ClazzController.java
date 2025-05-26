package com.itheima.controller;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQueryParam;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/clazzs")
@RestController
public class ClazzController {

    @Autowired
    private ClazzService clazzService;

    // 对应 API 文档 3.1: 班级列表查询 (条件分页)
    // 请求路径: /clazzs
    // 请求方式: GET
    @GetMapping
    public Result page(ClazzQueryParam clazzQueryParam) {
        log.info("分页查询班级: {}", clazzQueryParam);
        PageResult<Clazz> pageResult = clazzService.page(clazzQueryParam);
        return Result.success(pageResult);
    }

    // 对应 API 文档 3.6: 查询所有班级
    // 请求路径: /clazzs/list
    // 请求方式: GET
    // IMPORTANT: This mapping must be defined BEFORE "/{id}" to ensure "list" is not treated as an ID.
    @GetMapping("/list")
    public Result list() {
        log.info("查询所有班级");
        List<Clazz> clazzList = clazzService.findAll();
        return Result.success(clazzList);
    }

    // 对应 API 文档 3.4: 根据ID查询
    // 请求路径: /clazzs/{id}
    // 请求方式: GET
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        log.info("根据ID查询班级: {}", id);
        Clazz clazz = clazzService.getById(id);
        return Result.success(clazz);
    }

    // 对应 API 文档 3.2: 删除班级
    // 请求路径: /clazzs/{id}
    // 请求方式: DELETE
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("根据ID删除班级: {}", id);
        clazzService.deleteById(id);
        return Result.success();
    }

    // 对应 API 文档 3.3: 添加班级
    // 请求路径: /clazzs
    // 请求方式: POST
    @PostMapping
    public Result save(@RequestBody Clazz clazz) {
        log.info("新增班级: {}", clazz);
        clazzService.save(clazz);
        return Result.success();
    }

    // 对应 API 文档 3.5: 修改班级
    // 请求路径: /clazzs
    // 请求方式: PUT
    @PutMapping
    public Result update(@RequestBody Clazz clazz) {
        log.info("修改班级: {}", clazz);
        clazzService.update(clazz);
        return Result.success();
    }
}
