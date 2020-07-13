package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class Controller {
	
	@GetMapping("/")
	
	List<Employee> getEmployee()
	{
		Employee a=new Employee();
		a.setId(1);
		a.setName("Girisha M");
		a.setAge(19);
	
		
		Employee b=new Employee();
		b.setId(2);
		b.setName("Srija niki");
		b.setAge(13);
		
		Employee c=new Employee();
		c.setId(3);
		c.setName("Jyothi");
		c.setAge(20);
		
		
		ArrayList <Employee> d = new ArrayList<Employee>();
		d.add(a);
		d.add(b);
		d.add(c);
		
		return d;
	}
}
