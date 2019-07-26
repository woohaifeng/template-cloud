package com.company.service.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "hi")
    public String sayHi() {
        return String.format("hi://service-user: %s",port);
    }

}
