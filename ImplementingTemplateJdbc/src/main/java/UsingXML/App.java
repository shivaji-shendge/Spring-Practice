package UsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		DriverManagerDataSource datasource= (DriverManagerDataSource) context.getBean("dataSource");
		if(datasource!=null) {
			System.out.println("Database connecte");
			//datasource initialized by constructor
			JdbcTemplate template = new JdbcTemplate(datasource);
			
			//another way by template.setDataSource(dataSource);
			
			template.execute("insert into student values ('0','ram',18)");
			System.out.println("Record save successfully...");
		}
		else {
			System.out.println("Database not connected");
		}

	}

}
