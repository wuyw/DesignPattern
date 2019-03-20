package proxyPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/20 下午7:36
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName =fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
