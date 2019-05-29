package me.liukunpeng.pattern.abstractFactory;

public class 正方形 implements 形状 {
    @Override
    public void draw() {
        System.out.println("Inside 正方形::draw() method.");
    }
}
