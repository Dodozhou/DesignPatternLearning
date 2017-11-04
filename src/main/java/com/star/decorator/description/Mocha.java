package com.star.decorator.description;
/**
 * CondimentDecorator的具体装饰者之一
 * 摩卡是一个装饰者，所以让它继承CondimentDecorator，注意，后者继承自Beverage，
 * 所以Mocha和基本组件的类型统一了
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    /**
     * 注入被装饰者，以调用它的信息来合成新的信息
     * @param beverage 被装饰者
     */
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }
    /**
     * 计算价格.
     * 被装饰者的价格和装饰器的价格相加，合成新的价格
     */
    @Override
    public double cost() {
        return 0.19+beverage.cost();
    }
}
