package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/log.do")
	public String validLogin(LoginDTO loginDTO, HttpServletRequest req) {
		
		String message = loginService.validateAndLogin(loginDTO);
		String callFile = "";
		
		
		if(message.equalsIgnoreCase("User verified. Login Successful")) {
			req.setAttribute("message", message);
			callFile = "homePage.jsp";
		}
		else {
			req.setAttribute("message", message);
			callFile = "showMsg.jsp";
		}
						
		return callFile;
	}
}
