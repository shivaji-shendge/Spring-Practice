package com.ss;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import RepositoryLayer.StudentDao;
import RepositoryLayer.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages="com.ss")
public class DbConfig {
	@Bean(name={"dm"})
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/college");
		datasource.setUsername("root");
		datasource.setPassword("root");
		return datasource;
	}
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate() {
		JdbcTemplate template = new JdbcTemplate(getDataSource());
		template.setDataSource(getDataSource());
		return template;
	}
	@Bean(name={"studentDaoImpl"})
	public StudentDao getStudentDao() {
		StudentDaoImpl studentDao = new StudentDaoImpl();
		studentDao.setTemplate(getTemplate());
		return studentDao;
		
	}

}
