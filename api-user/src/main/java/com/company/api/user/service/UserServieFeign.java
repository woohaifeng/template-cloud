package com.company.api.user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "service-user")
public interface UserServieFeign {

    @GetMapping(value = "hi")
    public String sayHi();
}
