package com.liusx.feign.auth.controller;

import com.liusx.feign.auth.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    IAccountService accountService;

    @PostMapping("/login")
    public String login(String userName, String password) {
        return accountService.login(userName, password);
    }
}
