package com.itheima.mapper;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 员工信息
 */
@Mapper
public interface EmpMapper {

    /**
     * 条件查询员工信息
     */
    public List<Emp> list(EmpQueryParam empQueryParam);

    /**
     * 新增员工基本信息
     */
    @Options(useGeneratedKeys = true, keyProperty = "id") //获取到生成的主键 -- 主键返回
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time)" +
            " values (#{username}, #{name}, #{gender}, #{phone}, #{job}, #{salary}, #{image}, #{entryDate}, #{deptId}, #{createTime}, #{updateTime})")
    void insert(Emp emp);

    /**
     * 根据ID删除员工
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 根据ID查询员工信息
     */
    Emp getById(Integer id);

    /**
     * 修改员工信息
     */
    void updateById(Emp emp);

    /**
     * 统计员工职位人数
     */
    List<Map<String, Object>> countEmpJobData();

    /**
     * 统计员工性别人数
     */
    List<Map<String, Object>> countEmpGenderData();

    /**
     * 查询所有员工
     */
    @Select("select e.*, d.name deptName from emp e left join dept d on e.dept_id = d.id order by e.update_time desc")
    List<Emp> findAll();

    /**
     * 根据部门ID统计员工数量
     * @param deptId 部门ID
     * @return 员工数量
     */
    Integer countByDeptId(Integer deptId);
}
