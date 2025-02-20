package com.ss;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import EntityLayer.Student;
import RepositoryLayer.StudentDao;
import RepositoryLayer.StudentDaoImpl;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Scanner sc = new Scanner(System.in);
		int menu=0;
		do {
			System.out.println("1. Insert data into student");
			System.out.println("2. update student info by id");
			System.out.println("3. delete student by name");
			System.out.println("........................................");
			int exp=sc.nextInt();
			Student student = new Student();
			StudentDaoImpl studentDao = context.getBean("studentDaoImpl",StudentDaoImpl.class);
			
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
					System.out.println("XXX   Some problem to insert data XXX....\n");
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
			default :
				break;
			}
			System.out.println("Do you want to continue (1--> Yes, 0--> Exit)");
			menu=sc.nextInt();
			System.out.println("=================================================================================");

		}while(menu!=0);
	}

}
