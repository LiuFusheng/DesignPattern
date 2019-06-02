package me.liukunpeng.pattern.builder;

public abstract class 汉堡 implements Item {

    @Override
    public Packing packing() {
        return new 包装纸();
    }

    @Override
    public abstract float price();
}