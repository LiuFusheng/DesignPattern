package me.liukunpeng.pattern.factory;

import me.liukunpeng.pattern.factory.plan1.形状;
import me.liukunpeng.pattern.factory.plan1.形状工厂Factory;
import me.liukunpeng.pattern.factory.plan2.电脑;
import me.liukunpeng.pattern.factory.plan2.电脑工厂Factory;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void getComputer() {
        电脑 pc = 电脑工厂Factory.getComputer("pc", "2 GB", "500 GB", "2.4 GHz");
        电脑 server = 电脑工厂Factory.getComputer("server", "16 GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }


    @Test
    public void getShape() {
        形状工厂Factory shapeFactory = new 形状工厂Factory();

        形状 shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        形状 shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        形状 shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

    }
}