package com.offer.offer01;

/**
 * @author zth
 * @Date 2019-07-27 15:41
 * 饿汉模式
 */
public class HugerSingleton {
    private HugerSingleton(){}

    private static final HugerSingleton singleton = new HugerSingleton();

    public static HugerSingleton getInstance(){
        return singleton;
    }

}
