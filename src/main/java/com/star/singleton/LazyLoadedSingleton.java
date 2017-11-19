package com.star.singleton;

public class LazyLoadedSingleton {

    private LazyLoadedSingleton() {} //private构造方法，防止外部实例化该类


    private static class LazyHolder{  //静态私有内部类
        private static final LazyLoadedSingleton instance=new LazyLoadedSingleton();  //静态final实例
    }
    public static LazyLoadedSingleton getInstance(){
        return LazyHolder.instance;
    }
}
