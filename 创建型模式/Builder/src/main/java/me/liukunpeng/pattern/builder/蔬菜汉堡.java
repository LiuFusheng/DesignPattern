package me.liukunpeng.pattern.builder;

public class 蔬菜汉堡 extends 汉堡 {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "蔬菜汉堡";
    }
}
