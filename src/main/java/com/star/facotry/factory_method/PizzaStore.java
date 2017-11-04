package com.star.facotry.factory_method;

/**
 * 工厂方法模式.
 * 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个。
 * 工厂方法将类的实例化推迟到子类,
 *
 */
public abstract class PizzaStore {
    public Pizza orderPizza(){
        Pizza pizza;

        pizza=createPizza(); //不变的部分调用变化的部分

        pizza.prepare();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza();//变化的部分，工厂方法，由子类实现
}


