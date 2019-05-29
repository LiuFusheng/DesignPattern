package me.liukunpeng.pattern.abstractFactory;

public class 绿色 implements 颜色 {
    @Override
    public void fill() {
        System.out.println("Inside 绿色::fill() method.");
    }
}
