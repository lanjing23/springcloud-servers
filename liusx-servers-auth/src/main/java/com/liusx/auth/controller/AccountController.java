package com.liusx.auth.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping("/login")
    public String login(String userName, String password) {
        return "登录成功8081,用户名 = " + userName + ", 密码 = " + password;
    }
}
