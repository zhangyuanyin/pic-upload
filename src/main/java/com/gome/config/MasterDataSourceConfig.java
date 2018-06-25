package com.gome.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = MasterDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDataSourceConfig {
	
	protected static final String PACKAGE = "com.gome.dao.master";
	protected static final String MAPPER_LOCATION = "classpath:mapper/master/*.xml";
	
	@Autowired
	@Qualifier("master")
	private DataSource dataSource;
	
	@Bean(name = "masterTransactionManager")
	@Primary
	public DataSourceTransactionManager masterTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
	
	@Bean(name = "masterSqlSessionFactory")
	@Primary
	public SqlSessionFactory masterSqlSessionFactory() throws Exception {
		final SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		factoryBean.setMapperLocations(resolver.getResources(MasterDataSourceConfig.MAPPER_LOCATION));
		return factoryBean.getObject();
	}
}
