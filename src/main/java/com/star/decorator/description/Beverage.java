package com.star.decorator.description;

/**
 * 装饰器模式中的顶层部件——抽象组件.
 * 抽象组件——Beverage（饮料），装饰器基类和具体组件都将继承该类，达到统一类型的目的
 */
public abstract class Beverage {  //Beverage 饮料
    String description="Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
