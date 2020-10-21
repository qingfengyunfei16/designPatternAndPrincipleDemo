package com.designPatternAndPrinciple.designPattern.structuralPatterns.adapter;

/**
 * @author Administrator
 * @description
 * @create 2020/10/21 14:51
 * @since 1.0.0
 */
public class LoginForSinaAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
