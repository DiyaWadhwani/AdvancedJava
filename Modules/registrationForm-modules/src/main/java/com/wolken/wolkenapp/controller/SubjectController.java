package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dto.SubjectsDTO;
import com.wolken.wolkenapp.entity.SubjectsEntity;
import com.wolken.wolkenapp.service.SubjectService;

@Controller
@RequestMapping("/")
public class SubjectController {

	@Autowired
	SubjectService subjectService;
	
	@RequestMapping("/addNewSubject.do")
	public String addNewSubject(@ModelAttribute SubjectsDTO subjectsDTO, HttpServletRequest req) {

		String message = subjectService.validateSubjectAndAdd(subjectsDTO);
		
		req.setAttribute("message", message);
		return "homePage.jsp";
	}
	
	@RequestMapping("/showSubjects.do")
	public String showSubjectsByType(HttpServletRequest req) {
		
		String subType = req.getParameter("subType");
		
		List <SubjectsEntity> subjectList = subjectService.validateTypeAndReturn(subType);
		
		if(subjectList.isEmpty()) {
			req.setAttribute("message", "No Subjects with type "+subType+" exist. Please try again");
		}
		
		else {
			req.setAttribute("subjectList", subjectList);
		}
		
		return "homePage.jsp";
	}
}
