package com.itheima.mapper;

import com.itheima.pojo.Student;
import com.itheima.pojo.StudentQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * 学员信息
 */
@Mapper
public interface StudentMapper {

    /**
     * 条件查询学员信息
     */
    public List<Student> list(StudentQueryParam studentQueryParam);

    /**
     * 批量删除学员
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 新增学员
     */
    @Insert("insert into student(name, no, gender, phone, id_card, is_college, address, degree, graduation_date, clazz_id, violation_count, violation_score, create_time, update_time)" +
            " values (#{name}, #{no}, #{gender}, #{phone}, #{idCard}, #{isCollege}, #{address}, #{degree}, #{graduationDate}, #{clazzId}, #{violationCount}, #{violationScore}, #{createTime}, #{updateTime})")
    void insert(Student student);

    /**
     * 根据ID查询学员
     */
    @Select("select s.*, c.name clazzName from student s left join clazz c on s.clazz_id = c.id where s.id = #{id}")
    Student getById(Integer id);

    /**
     * 修改学员
     */
    void updateById(Student student);

    /**
     * 违纪处理
     */
    @Update("update student set violation_count = violation_count + 1, violation_score = violation_score + #{score} where id = #{id}")
    void updateViolation(@Param("id") Integer id, @Param("score") Integer score);

    /**
     * 统计学员学历人数
     */
    List<Map<String, Object>> countStudentDegreeData();

    /**
     * 统计班级人数
     */
    List<Map<String, Object>> countStudentCountData();
}
