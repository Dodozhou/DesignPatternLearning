package com.star.decorator;

/**
 * 测试装饰器模式的类.
 */
public class TestDecorator {
    public static void main(String[] args) {
        /*
         * 这里类型只能用Beverage，不能用Espresso等具体类型，
         * 因为只有针对抽象组件类型编程时，才不会因为装饰者而受到影响
         */
        Beverage beverage=new Espresso();
        
        //订一杯浓咖啡，什么都不加
        System.out.println(beverage.getDescription()+" $"+beverage.cost());

        //订一杯茶，加摩卡和双份豆浆
        Beverage beverage1=new Tea();
        beverage1=new Mocha(beverage1);
        beverage1=new Soy(beverage1);
        beverage1=new Soy(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
    }
}
