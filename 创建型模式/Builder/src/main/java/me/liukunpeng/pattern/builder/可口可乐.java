package me.liukunpeng.pattern.builder;

public class 可口可乐 extends 冷饮 {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "可口可乐";
    }
}