package prototypePattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/10 下午4:28
 *
 *  TODO
 * 代理模式：
 *
 * 使用场景：
 *
 *
 * 优缺点：
 *
 *
 *
 */
public class PrototypePattern {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShape.getType());

        Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
