package decoratorPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/17 上午11:24
 */
public class ShapeDecorator implements Shape{

    protected Shape decoratedShape;


    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
