package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;

@Service("studService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;
	
	@Override
	public String registerStudent(StudentDTO dto) {
        Student student;
        String id = "";
        System.out.println(dto);
		//convert dto to entity
		student=new Student();
		student.setSname(dto.getSname());
		student.setAddrs(dto.getAddrs());
		student.setCourse(dto.getCourse());
		student.setHobbies(dto.getHobbies());
		student.setQlfy(dto.getQlfy());
		
		return dao.saveStudent(student);
		
		//invoke method
//		id=dao.saveStudent(student);
//		if(id.equals(0)) {
//			return "Student Registration Failed";
//		}else {
//			return "Student Registration Sucess with id:"+id;
//		}
	}//method
}//class
