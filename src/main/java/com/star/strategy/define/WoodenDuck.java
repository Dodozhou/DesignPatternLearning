package com.star.strategy.define;

/**
 * Duck的实现类,木鸭子，木鸭子会游泳，但是不能自己飞
 */
public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior=new FlyByRocket();
    }
}
