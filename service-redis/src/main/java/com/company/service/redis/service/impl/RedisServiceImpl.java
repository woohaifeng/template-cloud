package com.company.service.redis.service.impl;

import com.company.service.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@Service
public class RedisServiceImpl implements RedisService {
    @Autowired
    private RedisTemplate jsonRedisTemplate;

    @Override
    public void put(String key, Object value, long seconds) {
        jsonRedisTemplate.opsForValue().set(key,value,seconds, TimeUnit.SECONDS);
    }

    @Override
    public Object get(String key) {
        return jsonRedisTemplate.opsForValue().get(key);
    }
}
