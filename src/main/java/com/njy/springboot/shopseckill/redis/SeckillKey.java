package com.njy.springboot.shopseckill.redis;

/**
 * Created by jiangyunxiong on 2018/5/29.
 */
public class SeckillKey extends BasePrefix {
    private SeckillKey(String prefix) {
        super(prefix);
    }

    public static SeckillKey isGoodsOver = new SeckillKey("go");
}
