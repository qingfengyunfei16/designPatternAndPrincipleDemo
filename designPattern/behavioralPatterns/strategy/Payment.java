package com.designPatternAndPrinciple.designPattern.behavioralPatterns.strategy;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 11:02
 * @since 1.0.0
 */
public abstract class Payment {
    /**
     * 支付类型
     * @return
     */
    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public PayState pay(String uid, double amount) {
        if(queryBalance(uid) < amount) {
            return new PayState(500, "支付失败","余额不足");
        }
        return new PayState(200, "支付成功", "支付金额：" + amount);
    }
}
