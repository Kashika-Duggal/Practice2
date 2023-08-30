package com.hcl.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.repository.StudentInfoRepository;
import com.hcl.entity.StudentInfo;

@Service
public class StudentInfoService {

	@Autowired
	StudentInfoRepository studentInfoRepository;
	
	public String addStudentDetails(StudentInfo student) {
		studentInfoRepository.save(student);
		
		return "Student details added Successfully";
		
	}

	public StudentInfo getStudentDetails(String Id) {
		
		Optional<StudentInfo> student = studentInfoRepository.findById(Id);
		
		if(student.isPresent()) {
			return student.get();
		}
		return null;
		
	}
	
	public void delete(String Id)   
	{  
		studentInfoRepository.deleteById(Id);  
	}  
}
