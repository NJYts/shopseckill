package com.njy.springboot.shopseckill.controller;

import com.njy.springboot.shopseckill.rabbitmq.MQSender;
import com.njy.springboot.shopseckill.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    RedisService redisService;


    @Autowired
    MQSender sender;

//    @RequestMapping("/mq")
//    @ResponseBody
//    public Result<String> mq() {
//        sender.send("hello,imooc");
//        return Result.success("Hello，world");
//    }

//    @RequestMapping("/mq/topic")
//    @ResponseBody
//    public Result<String> topic() {
//        sender.sendTopic("hello,imooc");
//        return Result.success("Hello，world");
//    }
//    @Autowired
//    UserService userService;
//
//    @RequestMapping("/")
//    @ResponseBody
//    String home() {
//        return "Hello World";
//    }
//
//    @RequestMapping("/hello")
//    @ResponseBody
//    public Result<String> hello() {
//        return Result.success("hello, Jesper");
//    }
//
//    @RequestMapping("/Error")
//    @ResponseBody
//    public Result<String> error() {
//        return Result.error(CodeMsg.SERVER_ERROR);
//    }
//
//    @RequestMapping("/Thymeleaf")
//    public String thymeleaf(Model model) {
//        model.addAttribute("name", "Jesper");
//        return "hello";
//    }
//
//    @RequestMapping("/redis/get")
//    @ResponseBody
//    public Result<User> redisGet() {
//        User user = redisService.get(UserKey.getById, ""+1, User.class);
//        return Result.success(user);
//    }
//
//    @RequestMapping("/redis/set")
//    @ResponseBody
//    public Result<Boolean> redisSet() {
//        User user = new User();
//        user.setId(1);
//        user.setName("Jesper");
//        Boolean b1 = redisService.set(UserKey.getById, ""+1, user);
//        return Result.success(b1);
//    }
//
//    @RequestMapping("/db/doubleInsert")
//    @ResponseBody
//    public Result<Boolean> doubleInsert() {
//        try {
//            userService.doubleInsert();
//            return Result.success(true);
//        } catch (Exception e) {
//            return Result.error(CodeMsg.PRIMARY_ERROR);
//        }
//    }
//
//    @RequestMapping("/db/get")
//    @ResponseBody
//    public Result<User> dbGet() {
//        User user = userService.getById(1);
//        return Result.success(user);
//    }

}
