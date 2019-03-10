package abstractFactoryPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 上午10:34
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
