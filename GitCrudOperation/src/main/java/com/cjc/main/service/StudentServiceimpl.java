package com.cjc.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student101;
import com.cjc.main.repository.StudentRepository;

@Service
public class StudentServiceimpl implements StudentInterface{
	@Autowired StudentRepository sr;
	@Override
	public Student101 saveData(Student101 s) {
		
		return sr.save(s);
	}

}
