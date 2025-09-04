package com.resto_review.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient(){
        // 配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://192.168.195.128:6379").setPassword("123321");
//        config.useSingleServer()
//                .setAddress("redis://192.168.195.128:6379")
//                .setPassword("123321")
//                .setConnectionPoolSize(20)
//                .setConnectionMinimumIdleSize(10)
//                .setIdleConnectionTimeout(10000)
//                .setConnectTimeout(5000)
//                .setTimeout(3000)
//                .setRetryAttempts(3)
//                .setRetryInterval(1500);
        // 创建RedissonClient对象
        return Redisson.create(config);
    }
}
