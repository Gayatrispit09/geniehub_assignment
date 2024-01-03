package com.example.first.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first.models.students;
import com.example.first.repository.studentrepo;

@RestController
public class Mycontroller implements Maincontroller {
	@Autowired
	private studentrepo studentrepo;

	@PostMapping("/add")
	public void addstudent(@RequestBody students students) {
		studentrepo.save(students);
	}

	@GetMapping("/getstu")
	public List<students> getstudent() {
		return studentrepo.findAll();
	}

	@DeleteMapping("{id}")
	public void deletestudent(@PathVariable String id) {
		try {
			studentrepo.deleteById(id);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@PutMapping("{id}")
	public void putStudent(@PathVariable String id, @RequestBody students students) {
		Optional<students> current = studentrepo.findById(id);
		if (current.isPresent()) {
			students stu = current.get();
			stu.setStuname(students.getStuname());
			stu.setStuaddress(students.getStuaddress());
			studentrepo.save(stu);
		}

	}

}
