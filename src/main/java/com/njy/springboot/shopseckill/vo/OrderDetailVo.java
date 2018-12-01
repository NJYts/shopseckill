package com.njy.springboot.shopseckill.vo;


import com.njy.springboot.shopseckill.bean.OrderInfo;

/**
 * Created by jiangyunxiong on 2018/5/28.
 */
public class OrderDetailVo {
    private GoodsVo goods;
    private OrderInfo order;
    public GoodsVo getGoods() {
        return goods;
    }
    public void setGoods(GoodsVo goods) {
        this.goods = goods;
    }
    public OrderInfo getOrder() {
        return order;
    }
    public void setOrder(OrderInfo order) {
        this.order = order;
    }
}
