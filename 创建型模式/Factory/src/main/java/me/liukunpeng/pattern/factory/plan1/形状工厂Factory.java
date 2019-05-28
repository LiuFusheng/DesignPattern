package me.liukunpeng.pattern.factory.plan1;

public class 形状工厂Factory {

    //使用 getShape 方法获取形状类型的对象
    public 形状 getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new 圆形();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new 长方形();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new 正方形();
        }
        return null;
    }
}