package singletonPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 下午2:43
 *
 *
 * 饿汉模式
 */
public class SingletonEhan {
    private static SingletonEhan instance = new SingletonEhan();
    private SingletonEhan(){}
    public static SingletonEhan getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }

}
