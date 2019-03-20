package proxyPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/20 下午2:59
 */
public class ProxyPattern {
    public static void main(String[] args) {
        Image image = (Image) new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("  ");
        // 图像不需要从磁盘加载
        image.display();
    }
}
