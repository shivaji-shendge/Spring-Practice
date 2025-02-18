package BeanAnnotationpackage;


public class Student {
	
	private Teacher teacher;
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void study() {
		System.out.println("Student is reading book");
	}
}
