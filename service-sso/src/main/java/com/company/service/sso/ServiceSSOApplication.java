package com.company.service.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.company.service.sso.service.consumer")
@EnableCircuitBreaker
@MapperScan(basePackages = "com.company.service.sso.mapper")
public class ServiceSSOApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceSSOApplication.class,args);
    }
}
