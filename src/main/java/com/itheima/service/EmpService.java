package com.itheima.service;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface EmpService {

    /**
     * 分页查询员工
     */
    PageResult<Emp> page(EmpQueryParam empQueryParam);

    /**
     * 根据IDs批量删除员工
     */
    void deleteByIds(List<Integer> ids) throws SQLException;

    /**
     * 新增员工
     */
    void save(Emp emp);

    /**
     * 根据ID查询员工
     */
    Emp getById(Integer id);

    /**
     * 修改员工
     */
    void update(Emp emp) throws SQLException;

    /**
     * 查询全部员工
     */
    List<Emp> findAll();
}
