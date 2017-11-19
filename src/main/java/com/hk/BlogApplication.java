package com.hk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 初始化的时候不加载DataSourceAutoConfiguration
// @SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}
}
