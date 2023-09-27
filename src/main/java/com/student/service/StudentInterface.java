package com.student.service;

import java.util.List;

import com.student.entity.Student;



public interface StudentInterface {
	
	public String save(Student student);
	public List<Student> getAllStudent();
	public Student getById(int id);
	public void delete(int id);
	public Student updateStudent(Student student);

}
