package com.star.strategy.define;

/**
 * Duck的子类之一，鸭子的一种，野鸭可以通过翅膀飞。
 */
public class WildDuck extends Duck {
    public WildDuck() {
        flyBehavior=new FlyByWing();
    }
}
