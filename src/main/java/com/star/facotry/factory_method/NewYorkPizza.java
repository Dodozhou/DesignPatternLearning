package com.star.facotry.factory_method;

public class NewYorkPizza implements Pizza {
    public void prepare() {
        System.out.println("Prepare NewYorkPizza!");
    }

    public void cut() {
        System.out.println("Cut NewYorkPizza!");
    }

    public void box() {
        System.out.println("Box NewYorkPizza!");
    }
}
