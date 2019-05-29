package me.liukunpeng.pattern.abstractFactory;

public class 颜色工厂 extends AbstractFactory {

    @Override
    public 形状 get形状(String shapeType) {
        return null;
    }

    @Override
    public 颜色 get颜色(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("红色")) {
            return new 红色();
        } else if (color.equalsIgnoreCase("绿色")) {
            return new 绿色();
        } else if (color.equalsIgnoreCase("蓝色")) {
            return new 蓝色();
        }
        return null;
    }
}
