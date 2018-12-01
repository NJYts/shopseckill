package com.njy.springboot.shopseckill.controller;

import com.njy.springboot.shopseckill.bean.User;
import com.njy.springboot.shopseckill.redis.RedisService;
import com.njy.springboot.shopseckill.result.Result;
import com.njy.springboot.shopseckill.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiangyunxiong on 2018/5/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @RequestMapping("/info")
    @ResponseBody
    public Result<User> info(Model model, User user) {
        return Result.success(user);
    }
}