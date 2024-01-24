package com.example.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
@Service
public class StuServiceImpl implements StuService{

	List<Student>list=List.of(
			new Student(1, "gayatri"),
			new Student(2, "Shrijeet"),
			new Student(3,"yuga")
			);
	
	@Override
	public Student getStudent(int stuid) {
		
		return this.list.stream().filter(student -> student.getStuid()==stuid).findAny().orElse(null);
	}
	
}
