package com.wolken.wolkenapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.entity.EditProfileEntity;
import com.wolken.wolkenapp.service.EditProfileService;

@Controller
@RequestMapping("/")
public class EditProfileController {
	
	@Autowired
	EditProfileService editProfileService;
	
	@RequestMapping("/getProfile.do")
	public String getProfileByEmail(HttpServletRequest req) {
		
		String studEmail = req.getParameter("studEmail");
		String callFile = "";
		
		EditProfileEntity editProfileEntity = editProfileService.validateEmailAndReturn(studEmail);
		
		if(editProfileEntity == null) {
			req.setAttribute("message", "User with entered email does not exist");
			callFile = "showMsg.jsp";
		}
		else {
			req.setAttribute("studDetails", editProfileEntity);
			callFile = "editProfile.jsp";
		}
		
		return callFile;
	}
	
	@RequestMapping("/updateProfile.do")
	public String updateProfile(@ModelAttribute EditProfileEntity editProfileEntity, HttpServletRequest req) {
		
		String callFile = "";
		int rows = editProfileService.updateStudDetails(editProfileEntity);
		
		if(rows <= 0) {
			req.setAttribute("message", "Update failed. Please try again");
			callFile = "showMsg.jsp";
		}
		
		else {
			req.setAttribute("newDetails", editProfileEntity);
			callFile = "showProfile.jsp";
		}
		
		return callFile;
	}
	

}
