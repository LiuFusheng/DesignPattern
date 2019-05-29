package me.liukunpeng.pattern.abstractFactory;

public class 长方形 implements 形状 {
    @Override
    public void draw() {
        System.out.println("Inside 长方形::draw() method.");
    }
}
