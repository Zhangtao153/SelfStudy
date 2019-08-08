package com.zth;

import redis.clients.jedis.Jedis;

/**
 * @author zth
 * @Date 2019-08-01 22:43
 */
public class JedisTest {
    public static void main(String[] args){
        // 创建客户端 设置 ip 和端口
        Jedis jedis = new Jedis("192.168.43.78",6379);
        // 设置密码
        jedis.auth("redis");
        // 设置值
        jedis.set("name","张三");
        // 获取值
        String name = jedis.get("name");
        System.out.println(name);

        // 释放连接资源
        jedis.close();

    }
}
