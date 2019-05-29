package me.liukunpeng.pattern.abstractFactory;


public class 红色 implements 颜色 {

    @Override
    public void fill() {
        System.out.println("Inside 红色::fill() method.");
    }
}
