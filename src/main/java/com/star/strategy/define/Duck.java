package com.star.strategy.define;

/**
 * 所有鸭子的父类，定义了鸭子的行为.
 */
public class Duck {
    /**
     * 嵌入的策略——飞行方式接口
     */
    protected FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 实现鸭子飞行方法.
     * 不同的鸭子有不同的飞行方式，这属于易变的算法族，应该分离出去形成策略。因此，
     * 采用调用嵌入的FlyBehavior接口的fly方法飞行。
     */
    public void performFly(){
        flyBehavior.fly();
    }

    /**
     * 鸭子有用的方法.
     * 所有的鸭子都会有用，该方法属于不变的方法，所以不需要分离出来。
     */
    public void swim(){
        System.out.println("All duck can swim！");
    }
}
