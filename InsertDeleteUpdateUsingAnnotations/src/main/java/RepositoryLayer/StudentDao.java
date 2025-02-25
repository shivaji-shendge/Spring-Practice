package RepositoryLayer;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ss.Student;

public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete (String name);
	public Student fetchStudent(int id);
	
}
