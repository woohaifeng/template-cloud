package com.company.service.sso.controller;

import com.company.common.domain.TbUser;
import com.company.service.sso.service.LoginService;
import com.company.service.sso.service.consumer.RedisService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.UUID;

@Controller
public class LoginController {
    @Autowired
    private RedisService redisService;

    @Autowired
    private LoginService loginService;

    @GetMapping(value = "/login")
    public String login() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(
            @RequestParam(value = "loginCode", required = true) String loginCode,
            @RequestParam(value = "plainPassword", required = true) String plainPassword,
            @RequestParam(value = "url", required = false) String url,
            RedirectAttributes redirectAttributes) {
        TbUser tbUser = loginService.login(loginCode, plainPassword);
        if (tbUser == null) {
            redirectAttributes.addFlashAttribute("msg","账号密码错误！");
        } else {
            String token = UUID.randomUUID().toString();
            if(StringUtils.isNotBlank(url)) {
                return "redirect:/"+url;
            }
            redirectAttributes.addFlashAttribute("msg","登陆成功！");
        }
        return "redirect:/login";
    }

}
