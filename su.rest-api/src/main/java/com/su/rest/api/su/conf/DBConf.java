package com.su.rest.api.su.conf;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
public class DBConf {
	
	@Value("hibernat.datasource.driver")
	private String DRIVER;
	
	@Value("hibernat.datasource.url")
	private String URL;
	
	@Value("hibernat.datasource.username")
	private String USERNAME;
	
	@Value("hibernat.datasource.password")
	private String PASSWORD;
	
	@Value("hibernate.datasource.dialect")
	private String DIALECT;
	@Value("package.scan")
	private String PACKAGE;
	
	
//	 @Bean
//	    public LocalSessionFactoryBean sessionFactory() {
//	        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//	        sessionFactory.setDataSource(dataSource());
//	        sessionFactory.setPackagesToScan(PACKAGE);
//	        sessionFactory.setHibernateProperties(hibernateProperties());
//	        return sessionFactory;
//	    }
//	 
//	 @Bean
//	    public DataSource dataSource() {
//	        BasicDataSource dataSource = new BasicDataSource();
//	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	        dataSource.setUrl("jdbc:mysql://localhost:3306/demo?createDatabaseIfNotExist=true");
//	        dataSource.setUsername("root");
//	        dataSource.setPassword("secret");
//	        return dataSource;
//	    }
	
	
	
	
	
	
	

}
