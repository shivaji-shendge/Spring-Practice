package RepositoryLayer;

import org.springframework.jdbc.core.JdbcTemplate;

import EntityLayer.Student;

public class StudentDaoImpl implements StudentDao {

	JdbcTemplate template ;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(Student student) {
		String query = "insert into student values(?,?,?)";
		int result = template.update(query,student.getId(),student.getName(),student.getAge());
		return result;
	}

	@Override
	public int update(Student student) {
		String query = "update student set name = ?, age = ? where id = ?";
		int result = template.update(query,student.getName(),student.getAge(),student.getId());
		return result;	
	}

	@Override
	public int delete(String name) {
		String query = "delete from student where name = ?";
		int result = template.update(query,name);
		return result;
	}

}
