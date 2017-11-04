package com.star.strategy.define;

public class Test {
    public static void main(String[] args) {
        Duck wildDuck=new WildDuck();
        wildDuck.performFly();
        wildDuck.swim();

        Duck woodenDuck=new WoodenDuck();
        woodenDuck.performFly();
        woodenDuck.swim();
    }
}
