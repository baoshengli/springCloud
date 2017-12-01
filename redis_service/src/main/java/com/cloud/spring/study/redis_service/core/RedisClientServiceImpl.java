package com.cloud.spring.study.redis_service.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import org.springframework.stereotype.Service;


@Service
public class RedisClientServiceImpl {
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;


    public void setEx(String key, String value , int expire) {
        //JedisConnection jd=jedisConnectionFactory.

        RedisConnection connection = null;

        try {
            connection = redisConnectionFactory.getConnection();
            connection.setEx(key.getBytes(), expire, value.getBytes());
        }catch (Exception e){
            // logger.warn("redis 保存数据出现情况，现发起一次重复连接", e);
            if (connection != null)
                connection.close();
            connection = redisConnectionFactory.getConnection();
            connection.setEx(key.getBytes(), expire, value.getBytes());
        }finally {
            if (connection != null)
                connection.close();
        }
    }

    public void del(String key) {
        RedisConnection connection = null;
        try {
            connection = redisConnectionFactory.getConnection();
            connection.del(key.getBytes());
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    public String get(String key) {
        RedisConnection connection = null;
        byte[] bytes = null;
        try {
            connection = redisConnectionFactory.getConnection();
            bytes = connection.get(key.getBytes());
        }finally {
            if (connection != null)
                connection.close();
        }
        if (bytes == null) {
            // logger.warn("redis缓存无此key，可能是超时失效了");
            return  null;
        }
        return  new String(bytes);
    }

    public void set(String key,String value) {
        RedisConnection connection = null;
        try {
            connection = redisConnectionFactory.getConnection();
            connection.set(key.getBytes(), value.getBytes());
        }finally {
            if (connection != null)
                connection.close();
        }
    }

}
