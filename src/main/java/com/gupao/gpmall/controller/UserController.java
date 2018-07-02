package com.gupao.gpmall.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gupao.gpmall.api.IUserService;
import com.gupao.gpmall.api.dto.UserLoginRequest;
import com.gupao.gpmall.api.dto.common.Result;
import com.gupao.gpmall.dto.LoginRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 15995 on 2018/7/2.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    IUserService userService ;

    @PostMapping("/login")
    public Result login(@RequestBody LoginRequest req){
        UserLoginRequest request = new UserLoginRequest();
        request.setUserName(req.getUserName());
        request.setPassword(req.getPassword());
        return userService.userLogin(request);
    }



}
