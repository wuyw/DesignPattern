package bridgePattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/12 上午10:04
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
