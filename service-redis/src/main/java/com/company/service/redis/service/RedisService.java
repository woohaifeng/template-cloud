package com.company.service.redis.service;

public interface RedisService {

    public void put(String key,Object value,long seconds);

    public Object get(String key);
}
