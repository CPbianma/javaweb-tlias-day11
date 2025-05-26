package com.itheima.pojo;

import lombok.Data;

@Data
public class StudentQueryParam {
    private Integer page = 1; //页码
    private Integer pageSize = 10; //每页展示记录数
    private String name; //学员姓名
    private Integer degree; //学历
    private Integer clazzId; //班级ID
}
