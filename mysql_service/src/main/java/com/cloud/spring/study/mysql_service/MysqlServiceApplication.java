package com.cloud.spring.study.mysql_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cloud.spring.study.mysql_service.mapper.**")
public class MysqlServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysqlServiceApplication.class, args);
	}
}
