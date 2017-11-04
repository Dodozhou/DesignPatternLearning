package com.star.facotry.abstract_factory;

/**
 * 抽象工厂PizzaIngredientFactory的实现
 * @see PizzaIngredientFacotry
 */
public class NYPizzaIngredientFacotry {
    public Sauce createSauce(){ //返回具体的酱汁
        return new NYSauce();
    }
    public Cheese createChesse(){
        return new NYChesse();
    }
}
