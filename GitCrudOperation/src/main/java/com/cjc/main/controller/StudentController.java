package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Student101;
import com.cjc.main.service.StudentInterface;

@RestController
public class StudentController {
	
	@Autowired StudentInterface si;
	@PostMapping("/save")
	public ResponseEntity<Student101> saveData(@RequestBody Student101 s)
	{
		Student101 stu=si.saveData(s);
		return new ResponseEntity<Student101>(stu,HttpStatus.CREATED);
		
	}

}
