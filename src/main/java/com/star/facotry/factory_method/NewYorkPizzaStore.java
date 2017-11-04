package com.star.facotry.factory_method;

/**
 * 实现了工厂方法。
 */
public class NewYorkPizzaStore extends PizzaStore{
        @Override
        protected Pizza createPizza() { //工厂方法的实现，创建类的对象。
            return new NewYorkPizza();
        }
}
