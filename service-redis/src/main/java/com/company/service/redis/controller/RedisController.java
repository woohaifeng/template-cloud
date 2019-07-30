package com.company.service.redis.controller;

import com.company.service.redis.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisService redisService;

    /**
     * 缓存数据
     * @param key
     * @param value
     * @param seconds
     * @return
     */
    @PostMapping("/put")
    public String put(@RequestParam(value = "key",required = true) String key, @RequestParam(value = "value",required = true)String value, @RequestParam(value = "seconds",required = true)long seconds) {
        redisService.put(key,value,seconds);
        return "ok";
    }

    /**
     * 取缓存
     * @param key
     * @return
     */
    @PostMapping("/get")
    public Object get(@RequestParam(value = "key",required = true) String key) {
        Object o = redisService.get(key);
        if(o!=null) {
            return o;
        }
        return "no_ok";
    }
}
