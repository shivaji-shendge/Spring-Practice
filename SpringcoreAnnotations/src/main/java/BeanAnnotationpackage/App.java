package BeanAnnotationpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Student s1 = context.getBean("getStudent", Student.class);
		System.out.println(s1);
		s1.study();
		s1.getTeacher().display();
		
		
	}

}
