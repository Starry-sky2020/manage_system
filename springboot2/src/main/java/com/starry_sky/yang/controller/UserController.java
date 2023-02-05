package com.starry_sky.yang.controller;

import com.starry_sky.yang.config.Result;
import com.starry_sky.yang.mapper.UserMapper;
import com.starry_sky.yang.pojo.User;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserMapper userMapper;
    /**
     *@RequestBody
     *把前端传过来的json转换为java对象
     */
    @PostMapping
    public Result<?> save(@RequestBody User user){
        userMapper.insert(user);
        return Result.success();
    }
}
