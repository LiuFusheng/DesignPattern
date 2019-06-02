package me.liukunpeng.pattern.builder;

public class 百事可乐 extends 冷饮 {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "百事可乐";
    }
}