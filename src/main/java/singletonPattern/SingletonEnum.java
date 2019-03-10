package singletonPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/8 下午2:47
 *
 * 枚举模式
 */
public enum SingletonEnum {
    INSTANCE;
    public void showMessage(){
        System.out.println("Hello World!");
    }
}

class demo{
    public static void main(String[] args) {
        SingletonEnum.INSTANCE.showMessage();
    }
}
