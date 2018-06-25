package com.gome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * <dt>程序启动类</dt>
 * @author yyzhang
 * @since 2018年5月10日11:36:46
 */
@SpringBootApplication
@PropertySource(value = "classpath:config/picture.properties")	//配置文件路径 
@EnableScheduling
@EnableCaching
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
