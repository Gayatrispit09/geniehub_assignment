package com.example.first.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.first.models.students;

public interface Maincontroller {
	
	public void addstudent(@RequestBody students students);
	public List<students> getstudent();
	public void deletestudent(@PathVariable String id);
	public void putStudent(@PathVariable String id ,@RequestBody students students) ;
	
			
}
