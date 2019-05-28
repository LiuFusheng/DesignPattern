package me.liukunpeng.pattern.factory.plan1;

public class 圆形 implements 形状 {

    @Override
    public void draw() {
        System.out.println("Inside 圆形::draw() method.");
    }
}