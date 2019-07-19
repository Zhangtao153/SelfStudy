package com.zth;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zth
 * @Date 2019-07-19 2:43
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.zth"})
public class Config {
}
