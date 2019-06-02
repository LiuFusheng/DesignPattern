package me.liukunpeng.pattern.builder;

public class 鸡肉汉堡 extends 汉堡 {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "鸡肉汉堡";
    }
}