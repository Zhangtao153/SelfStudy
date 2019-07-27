package com.offer.offer01;

/**
 * @author zth
 * @Date 2019-07-27 16:20
 */
public class Singleton_DoubleChick {
    private Singleton_DoubleChick(){}

    public static Singleton_DoubleChick instance;

    public static Singleton_DoubleChick getInstance(){
        if (null== instance){
            synchronized (Singleton_DoubleChick.class){
                if (null == instance){
                    instance = new Singleton_DoubleChick();
                }
            }
        }
        return instance;
    }
}

