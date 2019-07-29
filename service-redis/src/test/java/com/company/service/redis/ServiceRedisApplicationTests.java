package com.company.service.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceRedisApplication.class)
@ActiveProfiles(value = "dev")
public class ServiceRedisApplicationTests {
    @Autowired
    private RedisTemplate jsonRedisTemplate;

    @Test
    public void test() {
        Map<String,Object> map = new HashMap<>();
        map.put("a","111");
        map.put("b","222");
        jsonRedisTemplate.opsForValue().set("1",map,10000, TimeUnit.SECONDS);
    }

    class Aoo implements Serializable {
        int a;
        int b;

        public Aoo(int a,int b) {
            this.a = a;
            this.b = b;
        }
    }

}
