package com.ss;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import RepositoryLayer.StudentDaoImpl;

public class App {

	public static void main(String x[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(DbConfig.class);
		Scanner sc = new Scanner(System.in);
		Student student =new Student();
		StudentDaoImpl  studentDao = context.getBean("studentDaoImpl",StudentDaoImpl.class);
		int menu;
		do {
			System.out.println("1. Insert Student record");
			System.out.println("2. update Student record");
			System.out.println("3. delete Student record");
			System.out.println("4. Fetch Student record by id");

			int exp;
			exp=sc.nextInt();
			
			switch(exp) {
			case 1:
				System.out.println("Enter name and age of student");
				sc.nextLine();
				String name=sc.nextLine();
				int age = sc.nextInt();
				student.setName(name);
				student.setAge(age);
				int result = studentDao.insert(student);
				if(result!=0) {
					System.out.println("Data inserted successfully....\n");
				}
				else {
					System.out.println("XXX   Some problem to insert data   XXX....\n");
				}
				break;
			case 2:
                System.out.println("Enter id to update student information");
				
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter new name and age for student");
			    name= sc.nextLine();
			    age=sc.nextInt();
			    student.setId(id);
			    student.setName(name);
			    student.setAge(age);
				result = studentDao.update(student);
				if(result!=0) {
					System.out.println("Data updated successfully....\n");
				}
				else {
					System.out.println("XXX   Some problem to update data XXX....\n");
				}
				break;
			case 3:
				System.out.println("Enter name to delete student information");
				sc.nextLine();
				name=sc.nextLine();
				result = studentDao.delete(name);
				if(result!=0) {
					System.out.println("Data deleted successfully....\n");
				}
				else {
					System.out.println("XXX   Some problem to delete data XXX....\n");
				}

				break;
			case 4:
				System.out.println("Enter student id to fetch student record");
				int sid=sc.nextInt();
				student=studentDao.fetchStudent(sid);
				System.out.println("Id : "+student.getId()+"Name : "+student.getName()+"Age: "+student.getAge());
				break;

            default:
				break;
			}
			System.out.println("Continue-->1   Stop-->0");
			menu=sc.nextInt();

		}while(menu!=0);
	}
}
