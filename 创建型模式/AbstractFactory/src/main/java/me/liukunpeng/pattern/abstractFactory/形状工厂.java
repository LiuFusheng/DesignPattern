package me.liukunpeng.pattern.abstractFactory;

public class 形状工厂 extends AbstractFactory {
    @Override
    public 形状 get形状(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("圆形")){
            return new 圆形();
        } else if(shapeType.equalsIgnoreCase("长方形")){
            return new 长方形();
        } else if(shapeType.equalsIgnoreCase("正方形")){
            return new 正方形();
        }
        return null;
    }

    @Override
    public 颜色 get颜色(String color) {
        return null;
    }

}
