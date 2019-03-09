package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.command.StudentCmd;
import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	private StudentService service;
	
	//@RequestMapping(path="/home.htm",method=RequestMethod.POST)
	@PostMapping("/register")
	public String studentRegister(@RequestBody StudentCmd stCmd) {
		StudentCmd cmd=null;
		StudentDTO dto=null;
		String status=null;
		System.out.println(stCmd);
		//get Student Command
		cmd=stCmd;
		//copy cmd to dto
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		//invoke method
		status=service.registerStudent(dto);
		return status;
		
	}
}
