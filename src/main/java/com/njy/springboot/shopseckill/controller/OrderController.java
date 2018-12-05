package com.njy.springboot.shopseckill.controller;

import com.njy.springboot.shopseckill.bean.OrderInfo;
import com.njy.springboot.shopseckill.bean.User;
import com.njy.springboot.shopseckill.redis.RedisService;
import com.njy.springboot.shopseckill.result.CodeMsg;
import com.njy.springboot.shopseckill.result.Result;
import com.njy.springboot.shopseckill.service.GoodsService;
import com.njy.springboot.shopseckill.service.OrderService;
import com.njy.springboot.shopseckill.service.UserService;
import com.njy.springboot.shopseckill.vo.GoodsVo;
import com.njy.springboot.shopseckill.vo.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by njy on 2018/12/5.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    OrderService orderService;

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/detail")
    @ResponseBody
    public Result<OrderDetailVo> info(Model model, User user,
                                      @RequestParam("orderId") long orderId) {
        if(user == null) {
            return Result.error(CodeMsg.SESSION_ERROR);
        }
        OrderInfo order = orderService.getOrderById(orderId);
        if(order == null) {
            return Result.error(CodeMsg.ORDER_NOT_EXIST);
        }
        long goodsId = order.getGoodsId();
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        OrderDetailVo vo = new OrderDetailVo();
        vo.setOrder(order);
        vo.setGoods(goods);
        return Result.success(vo);
    }

}
