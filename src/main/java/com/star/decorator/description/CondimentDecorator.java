package com.star.decorator.description;

/**
 * 抽象的装饰器.
 * 装饰器的抽象类，所有的装饰器都将继承该类.该类同样继承自抽象组件Beverage以统一类型
 */
public abstract class CondimentDecorator extends Beverage {//Condiment 调味品
    //委托，使得装饰者可以在描述上加上自己独特的信息
    public abstract String getDescription();
}
