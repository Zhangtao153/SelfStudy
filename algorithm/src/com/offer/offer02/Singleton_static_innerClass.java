package com.offer.offer02;

/**
 * @author zth
 * @Date 2019-07-27 16:00
 * 内部类实现单例模式
 */
public class Singleton_static_innerClass {
    private static class SingletonHolder{
        private static final Singleton_static_innerClass instance = new Singleton_static_innerClass();
    }

    public static Singleton_static_innerClass getInstance(){
        return SingletonHolder.instance;
    }

    private Singleton_static_innerClass(){}
}

