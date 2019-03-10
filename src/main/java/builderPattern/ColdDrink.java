package builderPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/10 下午3:22
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
