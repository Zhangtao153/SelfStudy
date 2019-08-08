package com.zth;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author zth
 * @Date 2019-08-02 0:00
 */
public class JedisPoolTest {
    public static void main(String[] args){
        JedisPoolConfig config = new JedisPoolConfig();
        // 设置最大连接数
        config.setMaxTotal(100);
        // 设置最大空闲连接数
        config.setMaxIdle(10);

        JedisPool jedisPool = new JedisPool(config,"192.168.214.10",6379);
        Jedis jedis = null;


        try {
            // 获取连接
            jedis = jedisPool.getResource();
            // 设置密码
            jedis.auth("redis");
            jedis.set("嘻嘻","似是而非或是世事可畏,有情有义又是有米无炊");
            String str = jedis.get("嘻嘻");
            System.out.println(str);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 关闭连接
            if (jedis != null){
                jedis.close();
            }
            // 关闭连接池
            if (jedisPool != null){
                jedisPool.close();
            }
        }
    }
}
