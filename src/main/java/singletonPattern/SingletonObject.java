package singletonPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 上午11:20
 *
 * 单例模式
 *
 *
 * 应用场景：
 *
 * 优缺点：
 *
 *
 * 懒汉模式，线程不安全
 *
 */
public class SingletonObject {

    private static SingletonObject instance;

    private SingletonObject(){

    }
    public static SingletonObject getInstance(){
        if (instance == null){
            instance = new SingletonObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        singletonObject.showMessage();
    }
}
