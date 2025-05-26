package com.itheima.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.EmpExprMapper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.*;
import com.itheima.service.EmpLogService;
import com.itheima.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;
    @Autowired
    private EmpLogService empLogService;

    @Override
    public PageResult<Emp> page(EmpQueryParam empQueryParam) {
        //1. 设置分页参数(PageHelper)
        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());

        //2. 执行查询
        List<Emp> empList = empMapper.list(empQueryParam);

        //3. 解析查询结果, 并封装
        Page<Emp> p = (Page<Emp>) empList;
        return new PageResult<Emp>(p.getTotal(), p.getResult());
    }

    @Transactional(rollbackFor = {Exception.class}) //事务管理 - 默认出现运行时异常时回滚
    @Override
    public void deleteByIds(List<Integer> ids) throws SQLException {
        //1. 批量删除员工基本信息
        empMapper.deleteByIds(ids);

        //2. 记录操作日志
        for (Integer id : ids) {
            // TODO: 获取当前操作员ID和姓名
            EmpLog empLog = new EmpLog(null, id /*被删除员工ID作为操作ID占位*/, null /*操作员姓名未知*/, LocalDateTime.now(),
                    this.getClass().getName(), "deleteByIds", "ids: " + ids.toString(), null, 0L);
            empLogService.insert(empLog);
        }

        //模拟异常
        //if(true) throw new SQLException("数据库服务器连接异常");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void save(Emp emp) {
        //1. 补全基础属性
        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        emp.setPassword("123456"); //设置默认密码

        //2. 调用Mapper接口方法插入数据
        empMapper.insert(emp); //获取emp对象的ID
        System.out.println("获取到生成的主键ID: " + emp.getId());

        //3. 保存员工的工作经历信息
        List<EmpExpr> exprList = emp.getExprList();
        if(!CollectionUtils.isEmpty(exprList)){
            //遍历exprList集合, 为每一个工作经历对象的empId赋值
            exprList.forEach(empExpr -> {
                empExpr.setEmpId(emp.getId());
            });

            //批量保存工作经历数据
            empExprMapper.insertBatch(exprList);
        }
    }

    @Override
    public Emp getById(Integer id) {
        return empMapper.getById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(Emp emp) throws SQLException {
        //1. 更新员工基本信息
        emp.setUpdateTime(LocalDateTime.now()); //更新修改时间
        empMapper.updateById(emp);

        //2. 删除该员工原有的工作经历数据
        empExprMapper.deleteByEmpId(emp.getId());

        //3. 保存员工的工作经历信息
        List<EmpExpr> exprList = emp.getExprList();
        if(!CollectionUtils.isEmpty(exprList)){
            //遍历exprList集合, 为每一个工作经历对象的empId赋值
            exprList.forEach(empExpr -> {
                empExpr.setEmpId(emp.getId());
            });

            //批量保存工作经历数据
            empExprMapper.insertBatch(exprList);
        }

        //记录操作日志
        // TODO: 获取当前操作员ID和姓名
        EmpLog empLog = new EmpLog(null, emp.getId() /*被更新员工ID作为操作ID占位*/, null /*操作员姓名未知*/, LocalDateTime.now(),
                this.getClass().getName(), "update", "emp: " + emp.toString(), null, 0L);
        empLogService.insert(empLog);

        //模拟异常
        //if(true) throw new SQLException("数据库服务器连接异常");
    }

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }
}
