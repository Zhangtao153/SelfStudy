package com.zth;

import java.util.Date;

/**
 * @author zth
 * @Date 2019-06-19 21:55
 */
public class ManProxy implements IPerson {

    private IPerson target;

    public IPerson getTarget() {
        return target;
    }

    public ManProxy setTarget(IPerson target) {
        this.target = target;
        return this;
    }

    @Override
    public void say() {
        if (null != target){
            System.out.println(new Date()+"---syaing");
        }
    }
}
