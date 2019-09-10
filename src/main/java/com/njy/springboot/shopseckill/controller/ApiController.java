package com.njy.springboot.shopseckill.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author njy
 * @date 2019/7/8
 * @description 对外项目接口测试
 */
@Controller
@RequestMapping("/api")
public class ApiController {

    @RequestMapping("/pushurl")
    public String pushurl(@RequestBody JSONObject jsonParam){
        return "success";
    }

    @RequestMapping("/test")
    public String pushurl2(){
        return "success";
    }
}
