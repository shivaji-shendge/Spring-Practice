package RepositoryLayer;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ss.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate template ;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	@Override
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query="insert into student (name,age) values (?,?)";
		int result = template.update(query,student.getName(),student.getAge());
		return result;
	}

	@Override
	public int update(Student student) {
		// TODO Auto-generated method stub
		String query="update student set name=?, age=? where id=?";
		int result = template.update(query,student.getName(),student.getAge(),student.getId());
		return result;
	}

	@Override
	public int delete(String name) {
		// TODO Auto-generated method stub
		String query="delete from student where name=?";
		int result = template.update(query,name);
		return result;
		
	}

	@Override
	public Student fetchStudent(int id) {
		String query = "select *from student where id=?";
		RowMapper<Student> rowMapper= new myRowMapper();
		//Student student = template.queryForObject(query,rowMapper,id);
		
		//We can use Annonomus inner class for RowMapper so we dont need to implement in our class
		Student student = template.queryForObject(query, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setAge(rs.getInt(3));
				return student;
			}
			
		},id);
		 
		return student;
	}
	
}
