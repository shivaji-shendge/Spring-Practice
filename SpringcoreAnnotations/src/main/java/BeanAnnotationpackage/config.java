package BeanAnnotationpackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration                               // by this we are telling to spring container this is my configuration file
//@ComponentScan (basePackages = "com.ss")    //  it means scans the classes in this packages where get @Component, in this case it is not necessary bqz we are using @Bean
public class config {
	
	@Bean
	//@Bean( name = {'teacher', 'teacher1','t1'})  this is also allowed
	public Teacher getTeacher() {
		Teacher teacher = new Teacher();
		return teacher;
	}
	
	// we have to write method to get object so  container can get object
	@Bean
	
	public Student getStudent() {
		Student student = new Student(getTeacher());
		return student;
	}
}
