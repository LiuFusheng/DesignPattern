package com.liukunpeng.pattern;

public class 字节码观察者 extends 观察者Observer {

    public 字节码观察者(主题 subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("字节码 String: "
                + Integer.toBinaryString(subject.getState()));
    }
}