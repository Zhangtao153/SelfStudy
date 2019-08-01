package com.zth.quartz;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 * @author zth
 * @Date 2019-08-01 16:33
 */
@Component
public class MyAdaptableJobFactory extends AdaptableJobFactory {

    //AutowireCapableBeanFactory 可以将一个对象添加到SpringIOC容器中，并且完成该对象注入
    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        Object object =  super.createJobInstance(bundle);
        //将obj对象添加Spring IOC容器中，并完成注入
        this.autowireCapableBeanFactory.autowireBean(object);
        return object;
    }
}
