package com.zth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author zth
 * @Date 2019-07-25 10:47
 */
@EnableAutoConfiguration
@ComponentScan("com.zth")
public class App {
    public static void main(String[] args){
        // 启动 SpirngBoot 项目
        SpringApplication.run(App.class,args);
    }
}
