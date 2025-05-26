package com.itheima.service;

import com.itheima.pojo.PageResult;
import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;

import java.util.List;

public interface StudentService {

    /**
     * 分页查询学员
     */
    PageResult<Student> page(StudentQueryParam studentQueryParam);

    /**
     * 批量删除学员
     */
    void delete(List<Integer> ids);

    /**
     * 新增学员
     */
    void save(Student student);

    /**
     * 根据ID查询学员
     */
    Student getById(Integer id);

    /**
     * 修改学员
     */
    void update(Student student);

    /**
     * 违纪处理
     */
    void violation(Integer id, Integer score);
}
