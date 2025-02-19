package UsingAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
		JdbcTemplate template = context.getBean("template",JdbcTemplate.class);
		template.execute("insert into student values ('0','shyam',19)");
		System.out.println("Record save success..........");
	}

}
