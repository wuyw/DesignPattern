package bridgePattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/12 上午10:02
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
