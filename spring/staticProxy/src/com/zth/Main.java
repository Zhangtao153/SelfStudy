package com.zth;

/**
 * @author zth
 * @Date 2019-06-19 21:54
 */
public class Main {
    public static void main(String[] args){
        //new Man().say();

        ManProxy man =  new ManProxy().setTarget(new Man());
        man.say();
    }
}
