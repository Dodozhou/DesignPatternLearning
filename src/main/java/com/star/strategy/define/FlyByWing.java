package com.star.strategy.define;

/**
 * FlyBehavior的实现类之一。
 */
public class FlyByWing implements FlyBehavior {
    public void fly() {
        System.out.println("Flying by wing!");
    }
}
