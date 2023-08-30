package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.hcl.service.StudentInfoService;
import com.hcl.entity.StudentInfo;

@RestController
@RequestMapping("/StudentInfo")
public class StudentInfoController {

	@Autowired
	StudentInfoService studentInfoService;

	@PostMapping("/addDetails")
	public String addStudentDetails(@RequestBody StudentInfo student) {

		String addStatus = studentInfoService.addStudentDetails(student);

		return addStatus;
	}
	
	@GetMapping("/findStudentById/{Id}")
		public StudentInfo getStudentDetails(@PathVariable String Id) {
		
		StudentInfo student = studentInfoService.getStudentDetails(Id);
		
		return student;
		
		
	}
	
	@DeleteMapping("/{id}")  
	private void deleteBook(@PathVariable("id") String id)   
	{  
	studentInfoService.delete(id);  
	}  
	
	
}
