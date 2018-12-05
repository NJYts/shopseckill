package com.njy.springboot.shopseckill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: niujianye
 * @Date: 2018/12/5 14:18
 * @Description:
 */
@Controller
@RequestMapping("/remote")
public class indexController {
    @RequestMapping(value="/success/{Id}/{name}/{password}",method= RequestMethod.GET)
    @ResponseBody
    public String info(Model model, @PathVariable("Id") String Id, @PathVariable("name")   String name, @PathVariable("password")   String password) {

        return "success";
    }
    @RequestMapping("/success2")
    @ResponseBody
    public String info2(Model model, String Id,String name,String password) {

        return "success";
    }
}
