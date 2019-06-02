package me.liukunpeng.pattern.builder;

public abstract class 冷饮 implements Item {

    @Override
    public Packing packing() {
        return new 瓶子();
    }

    @Override
    public abstract float price();
}