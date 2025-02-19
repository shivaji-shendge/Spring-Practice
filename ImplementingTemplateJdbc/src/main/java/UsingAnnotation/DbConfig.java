package UsingAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.ss")
public class DbConfig {
	
	@Bean("db")
	public DriverManagerDataSource getConn() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/college","root","root");
	}

	@Bean("template")
	public JdbcTemplate gettemplate() {
		JdbcTemplate template = new JdbcTemplate(getConn());
		return template;
		
	}
}
