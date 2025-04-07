package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Course;

@RestController
public class courseController {

	@PostMapping(value="/add-course",consumes= {"application/xml","application/json"})
	public ResponseEntity<String> addCourse(@RequestBody Course course){
		System.out.print(course);
		return new ResponseEntity<String>("Dataadded",HttpStatus.CREATED);
	}
	
	@GetMapping(value="/get-course",produces= {"application/xml","application/json"})
	public ResponseEntity<Course> addCourse(){
		
		Course c=new Course(2,"Java","3Months");
		return new ResponseEntity<Course>(c,HttpStatus.OK);
	}
} 
