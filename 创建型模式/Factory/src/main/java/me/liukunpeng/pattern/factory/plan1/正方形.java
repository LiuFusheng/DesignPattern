package me.liukunpeng.pattern.factory.plan1;

public class 正方形 implements 形状 {

    @Override
    public void draw() {
        System.out.println("Inside 正方形::draw() method.");
    }
}