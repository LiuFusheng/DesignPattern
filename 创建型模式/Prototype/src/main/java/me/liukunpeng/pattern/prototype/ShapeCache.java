package me.liukunpeng.pattern.prototype;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap
            = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        圆形 circle = new 圆形();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        正方形 square = new 正方形();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        长方形 rectangle = new 长方形();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
