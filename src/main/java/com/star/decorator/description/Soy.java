package com.star.decorator.description;
/**
 * 抽象装饰者CondimentDecorator的实现者之一.
 * 豆浆也是一个装饰者，所以让它继承CondimentDecorator，注意，后者继承自Beverage，
 * 所以Soy和基本组件的类型统一了
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    /**
     *
     * @param beverage 注入被装饰者，以调用它的信息来合成新的信息
     */
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Soy";
    }
    /**
    * 被装饰者的价格和装饰器的价格相加，合成新的价格
    */
    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }
}
