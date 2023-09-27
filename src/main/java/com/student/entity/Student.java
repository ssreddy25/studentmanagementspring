package com.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "STUDENT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@NotNull
	@Size(min = 2, max = 15)
	private String fristName;
	@NotNull
	@Size(min = 2, max = 15)
	private String lastName;
	@NotNull
	@Size(min = 2, max =6 )
	private String branch;
	private String grade;
	@NotNull
	@Size(min = 2, max = 15)
	private String address;
	

}
