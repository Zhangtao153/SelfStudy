package com.zth.scheduled;

import com.zth.service.impl.UserService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 定义任务类
 */
public class MyJob implements Job {
    /**
     * 任务被触发时所执行的方法
     */
    @Autowired
    UserService userService;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        userService.addUser();
    }
}
