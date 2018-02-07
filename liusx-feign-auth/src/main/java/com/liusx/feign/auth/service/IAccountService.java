package com.liusx.feign.auth.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "liusx-servers-auth")
public interface IAccountService {

    @RequestMapping(value = "/auth/login", method = RequestMethod.POST)
    String login(@RequestParam("userName") String userName,
                 @RequestParam("password") String password);
}

