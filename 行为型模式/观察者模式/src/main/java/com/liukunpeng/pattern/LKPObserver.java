package com.liukunpeng.pattern;

public class LKPObserver extends 观察者Observer {

    public LKPObserver(主题 subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("lkp!!!" + subject.getState());
    }
}