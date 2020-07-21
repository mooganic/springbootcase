package com.learn.springboot.service.impl;

import com.learn.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author wuminggao
 * @create 2020-07-21-下午10:15
 */
@Service
public class StudentServiceImpl implements StudentService {
    //Spring-data-redis提供的操作redis的模板对象
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public void put(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    @Override
    public String get(String key) {
        String o = (String)redisTemplate.opsForValue().get(key);
        return o;
    }
}
