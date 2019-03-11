package adapterPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/11 上午9:52
 *
 * 适配器模式：
 * 是作为两个不兼容的接口之间的桥梁，这种类型的设计模式，属于机构型的模式，它结合了两个独立接口的功能。这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能
 *
 * 使用场景：
 * 主要解决在软件系统中，常常要将一些"现存的对象"放到新的环境中，而新环境要求的接口是现对象不能满足的
 *
 * 优缺点：
 * 优点：1、可以让任何两个没有关联的的类一起运行 2、提高了类的复用 3、增加了类的透明度 4、灵活性好
 * 缺点：1、过多地使用适配器，会让系统非常零乱，不易整体进行把握 2、由于java至多继承一个类，所以至多只能适配一个适配者类，而且目标必须是抽象类
 */
public class AdapterPattern {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
