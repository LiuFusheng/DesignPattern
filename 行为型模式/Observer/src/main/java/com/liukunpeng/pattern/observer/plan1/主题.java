package com.liukunpeng.pattern.observer.plan1;

import java.util.ArrayList;
import java.util.List;

public class 主题 {
    private static 主题 instance = new 主题();

    private 主题() {
    }

    /**
     * 获取唯一可用的对象
     * @return
     */
    public static 主题 getInstance() {
        return instance;
    }

    private List<观察者Observer> observers
            = new ArrayList();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(观察者Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (观察者Observer observer : observers) {
            observer.update();
        }
    }
}