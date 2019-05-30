package com.liukunpeng.pattern.plan2;

import java.util.Observable;
import java.util.Observer;

public class 观察者 implements Observer {
    @Override
    public void update(Observable o, Object object) {
        Blog blog=(Blog) object;
        System.out.println("发表的博客标题为："+blog.getTitle()+"文章的内容为："+blog.getContext());
    }
}