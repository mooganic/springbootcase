package com.learn.springboot.mapper;

import com.learn.springboot.model.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper//扫描DAO接口道Spring容器
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}