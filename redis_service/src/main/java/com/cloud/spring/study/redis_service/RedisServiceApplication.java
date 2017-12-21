package com.cloud.spring.study.redis_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class RedisServiceApplication {
	//@Autowired
	//private RedisClient redisClinet;
	public static void main(String[] args) {
		SpringApplication.run(RedisServiceApplication.class, args);
	}
	@RequestMapping("/set")
	public String set(String key, String value) throws Exception{
		//redisClinet.set(key, value);
		return "success";
	}

	@RequestMapping("/get")
	public String get(String key) throws Exception {
		//return redisClinet.get(key);
		return "";
	}
}
