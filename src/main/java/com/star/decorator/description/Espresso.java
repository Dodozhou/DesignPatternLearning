package com.star.decorator.description;

/**
 * Beverage的具体组件之一.
 * Beverage（饮料）的具体组件，Espresso（浓咖啡）,继承自Beverage，可以被装饰器类装饰
 */
public class Espresso  extends Beverage{

    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
