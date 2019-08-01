package com.zth.quartz;

import com.zth.scheduled.MyJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;

/**
 * @author zth
 * @Date 2019-08-01 15:44
 */
@Configuration
public class MyQuartz {
    /**
     * 创建 job 对象
     */
    @Bean
    public JobDetailFactoryBean jobDetailFactoryBean (){
        JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();
        // 关联 job 类
        jobDetailFactoryBean.setJobClass(MyJob.class);
        return jobDetailFactoryBean;
    }

    /**
     * 创建 Trigger 对象
     * Cron trigger
     */
    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean(JobDetailFactoryBean jobDetailFactoryBean){
        CronTriggerFactoryBean factoryBean = new CronTriggerFactoryBean();
        factoryBean.setJobDetail(jobDetailFactoryBean.getObject());
        factoryBean.setCronExpression("0/2 * * * * ?");
        return factoryBean;
    }


    /**
     * 创建 Scheduler 对象
     */

    @Bean
    public SchedulerFactoryBean schedulerFactoryBean(CronTriggerFactoryBean cronTriggerFactoryBean,MyAdaptableJobFactory myAdaptableJobFactory){
        SchedulerFactoryBean factoryBean = new SchedulerFactoryBean();
        // 关联 trigger
        factoryBean.setTriggers(cronTriggerFactoryBean.getObject());
        factoryBean.setJobFactory(myAdaptableJobFactory);
        return factoryBean;
    }

}
