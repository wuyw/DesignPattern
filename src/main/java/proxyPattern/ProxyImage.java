package proxyPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/20 下午8:53
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();

        System.out.println(" ");

        image.display();
    }
}
