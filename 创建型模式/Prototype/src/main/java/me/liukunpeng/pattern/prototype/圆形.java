package me.liukunpeng.pattern.prototype;

public class 圆形 extends Shape {

    public 圆形(){
        type = "圆形";
    }

    @Override
    public void draw() {
        System.out.println("Inside 圆形::draw() method.");
    }
}
