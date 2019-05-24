package com.miracle.wechat;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Qin,Shuocheng
 * 2019-05-19
 */
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("com.miracle.wechat.mappers")

public class App {
	
    private static Logger logger = Logger.getLogger(App.class);

	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	
}
