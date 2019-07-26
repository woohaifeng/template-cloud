package com.company.api.user.controller;

import com.company.api.user.service.UserServieFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserServieFeign userServieFeign;

    @GetMapping(value = "hi")
    public String sayHi() {
        return userServieFeign.sayHi();
    }

}
