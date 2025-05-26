package com.itheima.service.impl;

import com.itheima.mapper.EmpMapper;
import com.itheima.mapper.StudentMapper;
import com.itheima.pojo.JobOption;
import com.itheima.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private EmpMapper empMapper;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Map<String, Object> getEmpJobData() {
        List<Map<String, Object>> rawData = empMapper.countEmpJobData();
        List<String> jobList = new ArrayList<>();
        List<Number> dataList = new ArrayList<>();
        for (Map<String, Object> item : rawData) {
            jobList.add((String) item.get("name"));
            dataList.add((Number) item.get("value"));
        }
        Map<String, Object> result = new HashMap<>();
        result.put("jobList", jobList);
        result.put("dataList", dataList);
        return result;
    }

    @Override
    public List<Map<String, Object>> getEmpGenderData() {
        return empMapper.countEmpGenderData();
    }

    @Override
    public List<Map<String, Object>> getStudentDegreeData() {
        return studentMapper.countStudentDegreeData();
    }

    @Override
    public Map<String, Object> getStudentCountData() {
        List<Map<String, Object>> rawData = studentMapper.countStudentCountData();
        List<String> clazzList = new ArrayList<>();
        List<Number> dataList = new ArrayList<>();
        for (Map<String, Object> item : rawData) {
            clazzList.add((String) item.get("name"));
            dataList.add((Number) item.get("value"));
        }
        Map<String, Object> result = new HashMap<>();
        result.put("clazzList", clazzList);
        result.put("dataList", dataList);
        return result;
    }
}
