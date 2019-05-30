package com.liukunpeng.pattern.plan2;

import java.util.Observable;

public class 被观察者 extends Observable {
    public  void sendBlog(String title,String context){
        this.setChanged();
        Blog blog=new Blog(title,context);

        this.notifyObservers(blog);//通知观察者，我已经改变了

    }
}
