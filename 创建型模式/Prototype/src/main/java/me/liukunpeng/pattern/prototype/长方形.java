package me.liukunpeng.pattern.prototype;

public class 长方形 extends Shape {

    public 长方形(){
        type = "长方形";
    }

    @Override
    public void draw() {
        System.out.println("Inside 长方形::draw() method.");
    }
}