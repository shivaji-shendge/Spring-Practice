package RepositoryLayer;

import EntityLayer.Student;

public interface StudentDao {

	public int insert(Student student);
	public int update(Student student);
	public int delete(String name);
}
