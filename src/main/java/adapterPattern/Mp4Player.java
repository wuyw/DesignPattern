package adapterPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/11 上午10:01
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
