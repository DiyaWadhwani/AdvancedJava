package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.StudentDTO;
import com.wolken.wolkenapp.service.StudentService;

//@Component
@Controller
@RequestMapping("/")
public class StudentController {
	
	@Autowired
	StudentService studService;
	
	@RequestMapping("/register.do")
	public String newRegistration(@ModelAttribute StudentDTO studentDTO, HttpServletRequest req) {
		
		String message = studService.validateAndRegister(studentDTO);
		
		req.setAttribute("message", message);
		return "showMsg.jsp";
	}
}
