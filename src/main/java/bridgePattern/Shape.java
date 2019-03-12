package bridgePattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/12 上午10:16
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
