package com.company.service.sso.controller;

import com.company.service.sso.service.consumer.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    private RedisService redisService;

    @GetMapping(value = "/login")
    public String tologin() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(
            @RequestParam(required = true) String loginCode,
            @RequestParam(required = true) String plainPassword,
            @RequestParam(required = false) String url) {
        return null;
    }

}
