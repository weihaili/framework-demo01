package org.cn.kkl.test;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.multiaction.ParameterMethodNameResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

public class Test {
	
	public static void main(String[] args) {
		ParameterMethodNameResolver parameterMethodNameResolver;
		
		InternalResourceViewResolver internalResourceViewResolver;
		
		JstlView jstlView;
		
		BasicDataSource dataSource;
		
		SimpleUrlHandlerMapping handlerMapping;
		
		AnnotationSessionFactoryBean annotationSessionFactoryBean;
		
		HibernateTemplate hibernateTemplate;
		
		JdbcTemplate jdbcTemplate;
		
		HibernateTransactionManager hibernateTransactionManager;
	}

}
