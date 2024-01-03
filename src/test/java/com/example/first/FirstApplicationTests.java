package com.example.first;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.first.controllers.Mycontroller;
import com.example.first.models.students;
import com.example.first.repository.studentrepo;

@SpringBootTest
class FirstApplicationTests {

	@Mock
	private studentrepo studentrepo;
	
	@InjectMocks
	private Mycontroller mycontroller;
	
	@Test
	public void getstutest() {
		
	
	students stu1 = new students("1", "gayu", "mumbai");
	students stu2 = new students("2", "gayatri", "mumbai");
	
	List<students> mockStudents = Arrays.asList(stu1, stu2);
	
	when(studentrepo.findAll()).thenReturn(mockStudents);
	List<students> result = mycontroller.getstudent();
	
	assertEquals(2, result.size());
    assertEquals("gayu", result.get(0).getStuname());
    
	}
}
