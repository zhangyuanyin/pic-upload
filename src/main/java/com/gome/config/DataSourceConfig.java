package com.gome.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {
	
	@Bean(name = "master")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.master")
	public DataSource getMasterDataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "slave")
	@ConfigurationProperties(prefix = "spring.datasource.slave")
	public DataSource getSlaveDataSource() {
		return DataSourceBuilder.create().build();
	}
}
