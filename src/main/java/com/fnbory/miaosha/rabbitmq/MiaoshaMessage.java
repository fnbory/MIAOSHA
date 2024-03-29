package com.fnbory.miaosha.rabbitmq;

import com.fnbory.miaosha.domain.MiaoshaUser;

/**
 * @Author: fnbory
 * @Date: 2019/6/20 18:47
 */
public class MiaoshaMessage {
    private MiaoshaUser user;
    private long goodsId;
    public MiaoshaUser getUser() {
        return user;
    }
    public void setUser(MiaoshaUser user) {
        this.user = user;
    }
    public long getGoodsId() {
        return goodsId;
    }
    public void setGoodsId(long goodsId) {
        this.goodsId = goodsId;
    }
}
