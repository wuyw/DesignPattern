package adapterPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/11 上午10:00
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
