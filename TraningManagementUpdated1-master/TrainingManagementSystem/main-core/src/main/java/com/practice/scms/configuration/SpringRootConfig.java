package com.practice.scms.configuration;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * SpringRootConfig provides  beans for datasource and middle level services.
 * @author firoz
 *
 */
@Configuration
@ComponentScan(basePackages= {"com.practice.scms.daoimpl"})
@PropertySource("classpath:application.properties")
public class SpringRootConfig {

	  @Value("${jdbc.driver}")
	   private String jdbcDriver;

	   @Value("${jdbc.url}")
	   private String jdbcUrl;

	   @Value("${jdbc.username}")
	   private String username;

	   @Value("${jdbc.password}")
	   private String password;

	   /**
	    * baBasicDataSource methods return datasource object to perform database operation using jdbcTemplate.
	    * 
	    */
	
	@Bean
	public BasicDataSource getDataSource() {
		
		BasicDataSource ds = new BasicDataSource();
		
		  ds.setDriverClassName(jdbcDriver);
	      ds.setUrl(jdbcUrl);
	      ds.setUsername(username);
	      ds.setPassword(password);
		  ds.setMaxTotal(2);
		  ds.setInitialSize(1);
		  ds.setTestOnBorrow(true);
		 ds.setValidationQuery("Select 1");
		 ds.setDefaultAutoCommit(true);
		
		return ds;
		
	}
	
}
