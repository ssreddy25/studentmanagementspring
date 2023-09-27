package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentInterface;

@RestController 
public class StudentController {
	
	@Autowired
	private StudentInterface studentInterface;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Student student){
		
		return new ResponseEntity<>(studentInterface.save(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		return new ResponseEntity<List<Student>>(studentInterface.getAllStudent(), HttpStatus.OK);
		
	}
	 
	@GetMapping("/get/{id}")
	  public ResponseEntity<Student> getById(@PathVariable int id){
		  
		  return new ResponseEntity<Student>(studentInterface.getById(id),HttpStatus.OK);
		  
	  }
	
	@DeleteMapping("/delete/{id}")
	
	  public ResponseEntity<String> delete(@PathVariable int id) {
		studentInterface.delete(id);
		return new ResponseEntity<String>("student deleted",HttpStatus.OK);
		
		  
	  }
	
	   @PutMapping("/update")
	  public ResponseEntity<Student>  updateStudent(@RequestBody Student student){
		  
		  return new ResponseEntity<Student>(studentInterface.updateStudent(student),HttpStatus.OK);
		  
	  }
	
	  
	 
	
	
	

}
