package prototypePattern;

import java.util.Hashtable;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/10 下午4:23
 */
public class ShapeCache {
    private static Hashtable<String,Shape> shapeTable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeTable.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeTable.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeTable.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeTable.put(rectangle.getId(),rectangle);
    }

}
