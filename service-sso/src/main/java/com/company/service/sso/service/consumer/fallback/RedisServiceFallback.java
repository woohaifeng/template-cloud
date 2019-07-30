package com.company.service.sso.service.consumer.fallback;

import com.company.service.sso.service.consumer.RedisService;
import org.springframework.stereotype.Component;

@Component
public class RedisServiceFallback implements RedisService {
    @Override
    public String put(String key, String value, long seconds) {
        return null;
    }

    @Override
    public Object get(String key) {
        return null;
    }
}
