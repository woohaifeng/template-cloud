package com.company.service.redis.controller;

import com.company.service.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;

    @PostMapping("/put")
    public String put(String key,String value,long seconds) {
        redisService.put(key,value,seconds);
        return "ok";
    }

    @PostMapping("/get")
    public Object get(String key) {
        Object o = redisService.get(key);
        if(o!=null) {
            return o;
        }
        return "no_ok";
    }
}
