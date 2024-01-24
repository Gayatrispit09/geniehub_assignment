package com.example.student.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.student.entity.Student;
import com.example.student.service.StuService;

@RestController
@RequestMapping("/student")
public class stucontroller {
	
	@Autowired
	private StuService stuService;
	
	@Autowired
	
	private RestTemplate restTemplate;
	
	@GetMapping("/{stuid}")
	public Student getStudent(@PathVariable("stuid") int stuid) {
		Student student = this.stuService.getStudent(stuid);
		
		List addressList=this.restTemplate.getForObject("http://localhost:8081/address/student/"+student.getStuid(),List.class);
		student.setAddresses(addressList);
		return student;
	}
}
