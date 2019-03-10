package abstractFactoryPattern;

import sun.security.provider.SHA;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 上午10:06
 */
public class Square  implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
