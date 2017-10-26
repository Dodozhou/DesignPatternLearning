package com.star.decorator;

/**
 * Beverage的实现者之一.
 * 装饰者模式中的具体组件，继承自Beverage，可以被装饰器类包裹
 */
public class Tea extends Beverage{

    public Tea() {
        description="Tea";
    }

    @Override
    public double cost() {
        return 1.52;
    }
}
