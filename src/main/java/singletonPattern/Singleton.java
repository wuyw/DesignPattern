package singletonPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 下午2:26
 *
 *
 * 懒汉模式，线程安全
 *
 */
public class Singleton {
    private static Singleton instance ;
    private Singleton(){}
    public static synchronized  Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton.showMessage();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);

    }
}
