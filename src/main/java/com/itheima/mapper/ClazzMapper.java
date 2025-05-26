package com.itheima.mapper;

import com.itheima.pojo.Clazz;
import com.itheima.pojo.ClazzQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClazzMapper {

    /**
     * 条件查询班级信息
     */
    List<Clazz> list(ClazzQueryParam clazzQueryParam);

    /**
     * 根据ID删除班级
     */
    @Delete("delete from clazz where id = #{id}")
    void deleteById(Integer id);

    /**
     * 新增班级
     */
    @Insert("insert into clazz(name, room, begin_date, end_date, master_id, subject, create_time, update_time)" +
            " values (#{name}, #{room}, #{beginDate}, #{endDate}, #{masterId}, #{subject}, #{createTime}, #{updateTime})")
    void insert(Clazz clazz);

    /**
     * 根据ID查询班级
     */
    @Select("select * from clazz where id = #{id}")
    Clazz getById(Integer id);

    /**
     * 修改班级
     */
    void updateById(Clazz clazz);

    /**
     * 查询所有班级
     */
    @Select("select * from clazz order by update_time desc")
    List<Clazz> findAll();
}
