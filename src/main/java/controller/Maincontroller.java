package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import repository.studentrepo;
import student.students;

@RestController
public class Maincontroller {
	@Autowired
	studentrepo studentrepo;
	
	@PostMapping("/addstu")
	public void addstudent(students students) {
		studentrepo.save(students);
	}

}
