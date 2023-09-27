package com.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentServiceImplementaion implements StudentInterface {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String save(Student student) {
		// TODO Auto-generated method stub
		Student student1=studentRepository.save(student);
		if(student1!=null) {
			return "student added sucessfully";
		}
		return "student not added plese try agian";
	}

	@Override
	public List<Student> getAllStudent() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getById(int id) {
		
	  return studentRepository.findById(id).get();
	}

	@Override
	public void delete(int id) {
		
		studentRepository.deleteById(id);
	}

	@Override
	public Student updateStudent(Student student) {
		Student updateStudent = studentRepository.saveAndFlush(student);
	
			return updateStudent;
		
	}

}
