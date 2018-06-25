package com.gome.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = SlaveDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class SlaveDataSourceConfig {
	
	protected static final String PACKAGE = "com.gome.dao.slave";
	protected static final String MAPPER_LOCATION = "classpath:mapper/slave/*.xml";
	
	@Autowired
	@Qualifier("slave")
	private DataSource dataSource;
	
	@Bean(name = "slaveTransactionManager")
	public DataSourceTransactionManager slaveTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean(name = "slaveSqlSessionFactory")
	public SqlSessionFactory slaveSqlSessionFactory() throws Exception {
		final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		factoryBean.setMapperLocations(resolver.getResources(SlaveDataSourceConfig.MAPPER_LOCATION));
		return factoryBean.getObject();
	}
}
