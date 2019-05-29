package me.liukunpeng.pattern.abstractFactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class 工厂生成器Test {

    @Test
    public void getFactory() {
        //获取形状工厂
        AbstractFactory shapeFactory = 工厂生成器.getFactory("形状");

        //获取形状为 圆形 的对象
        形状 shape1 = shapeFactory.get形状("圆形");

        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取形状为 长方形 的对象
        形状 shape2 = shapeFactory.get形状("长方形");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取形状为 正方形 的对象
        形状 shape3 = shapeFactory.get形状("正方形");

        //调用 Square 的 draw 方法
        shape3.draw();

        //获取颜色工厂
        AbstractFactory colorFactory = 工厂生成器.getFactory("颜色");

        //获取颜色为 红色 的对象
        颜色 color1 = colorFactory.get颜色("红色");

        //调用 红色 的 fill 方法
        color1.fill();

        //获取颜色为 绿色 的对象
        颜色 color2 = colorFactory.get颜色("绿色");

        //调用 绿色 的 fill 方法
        color2.fill();

        //获取颜色为 蓝色 的对象
        颜色 color3 = colorFactory.get颜色("蓝色");

        //调用 蓝色 的 fill 方法
        color3.fill();

    }
}