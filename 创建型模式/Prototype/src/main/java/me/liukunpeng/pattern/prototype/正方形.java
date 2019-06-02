package me.liukunpeng.pattern.prototype;

public class 正方形 extends Shape {

    public 正方形(){
        type = "正方形";
    }

    @Override
    public void draw() {
        System.out.println("Inside 正方形::draw() method.");
    }
}