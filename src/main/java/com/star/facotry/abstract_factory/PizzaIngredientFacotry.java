package com.star.facotry.abstract_factory;


/**
 * 抽象工厂，使用组合创建了一些列产品的集合。
 */
public interface PizzaIngredientFacotry { //接口中，每一种原料都有一个方法创建该原料。
    public Sauce createSauce();
    public Cheese createChesse();
}
