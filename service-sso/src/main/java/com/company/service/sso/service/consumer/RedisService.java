package com.company.service.sso.service.consumer;

import com.company.service.sso.service.consumer.fallback.RedisServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-redis",fallback = RedisServiceFallback.class)
public interface RedisService {

    @PostMapping("/put")
    public String put(@RequestParam(value = "key",required = true) String key, @RequestParam(value = "value",required = true)String value, @RequestParam(value = "seconds",required = true)long seconds);

    @PostMapping("/get")
    public Object get(@RequestParam(value = "key",required = true) String key);

}
