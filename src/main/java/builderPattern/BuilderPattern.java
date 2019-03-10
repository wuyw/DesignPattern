package builderPattern;

/**
 * @author : wuyuwu@shuidihuzhu.com
 * @Date : 2019/3/10 上午11:37
 *
 * 建造者模式：
 * 使用多个简单的对象一步一步构建一个复杂的对象，
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 *
 * 应用场景：
 * 主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
 *
 *
 * 优缺点：
 * 优点：1、建造者独立，易扩展   2、便于控制细节
 *
 * 缺点：1、产品必须有共同点，范围有限制 2、如果内部变化复杂，会有很多的建造类
 *
 */
public class BuilderPattern {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " +nonVegMeal.getCost());
    }
}
