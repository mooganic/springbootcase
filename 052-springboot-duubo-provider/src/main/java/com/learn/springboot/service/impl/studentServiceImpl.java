package com.learn.springboot.service.impl;

import com.learn.springboot.mapper.StudentMapper;
import com.learn.springboot.model.Student;
import com.learn.springboot.service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author wuminggao
 * @create 2020-07-23-下午10:50
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
        (interfaceClass = studentService.class, version = "1.0.0", timeout = 15000)
public class studentServiceImpl implements studentService {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        Student student = studentMapper.selectByPrimaryKey(id);
        return student;
    }

    @Override
    public Integer queryStudentCount() {
        Integer studentCount = (Integer) redisTemplate.opsForValue().get("studentCount");
        if (studentCount == null){
            //从数据库中查询
            studentCount = studentMapper.queryStudentCount();
            //存到redis
            redisTemplate.opsForValue().set("studentCount", studentCount, 30, TimeUnit.SECONDS);
        }

        return studentCount;
    }


}
