package com.wolken.wolkenapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wolken.wolkenapp.dao.TeamDAO;
import com.wolken.wolkenapp.dto.TeamDTO;
import com.wolken.wolkenapp.service.TeamService;

@Component
@RequestMapping("/")
public class TeamController {
	
	@Autowired
	TeamService teamService;
	
	@RequestMapping("/add.do")
	public String addTeam (@ModelAttribute TeamDTO teamDTO, HttpServletRequest req) {
		
		int rows = teamService.validateAndAdd(teamDTO);
		
		if(rows > 0) {
			req.setAttribute("message", "Registration Successful\nNew Team Registered");
		}
		else {
			req.setAttribute("message", "Registration failed\nPlease try again");
		}
				
		return "showMsg.jsp";
	}
	
	@RequestMapping("/displayAll.do")
	public String displayTeams (HttpServletRequest req) {
		
		List<TeamDTO> teamsList = teamService.validateAndDisplay();
		
		String callFile;
		
		if(teamsList == null) {
			req.setAttribute("message", "No teams have been registered yet");
			callFile = "showMsg.jsp";
		}
		else {
			req.setAttribute("teamsList", teamsList);
			callFile = "displayTeams.jsp";
		}
		
		return callFile;
		
	}
	
	@RequestMapping("/updateByID.do")
	public String UpdateByID(@ModelAttribute TeamDTO teamDTO, HttpServletRequest req) {
		
		int rows = teamService.validateAndUpdateByID(teamDTO);
		
		if(rows > 0) {
			req.setAttribute("message", "Update executed");
		}
		else {
			req.setAttribute("message", "Update failed");
		}
		
		return "showMsg.jsp";
	}
	
	@RequestMapping("/updateByName.do")
	public String UpdateByName(HttpServletRequest req) {
		
		String teamName = req.getParameter("teamName");
		String teamSport = req.getParameter("teamSport");
		String players = req.getParameter("teamPlayers");
		int teamPlayers = Integer.parseInt(players);
		
		System.out.println(teamName+" "+teamSport+" "+teamPlayers);
		
		int rows = teamService.validateAndUpdateByName(teamName, teamSport, teamPlayers);
		
		if(rows > 0) {
			req.setAttribute("message", "Update executed");
		}
		else {
			req.setAttribute("message", "Update failed");
		}
		
		return "showMsg.jsp";
	}
	
	@RequestMapping("/deleteByID.do")
	public String deleteByID(HttpServletRequest req) {
		
		String teamID = req.getParameter("teamID");
		
		int rows = teamService.validateAndDeleteByID(Integer.parseInt(teamID));
		
		if(rows > 0) {
			req.setAttribute("message", "Update executed");
		}
		else {
			req.setAttribute("message", "Update failed");
		}
		
		return "showMsg.jsp";
	}
	
	@RequestMapping("/deleteByName.do")
	public String deleteByName(HttpServletRequest req) {
		
		int rows = teamService.validateAndDeleteByName(req.getParameter("teamName"));
		
		if(rows > 0) {
			req.setAttribute("message", "Delete executed");
		}
		else {
			req.setAttribute("message", "Delete failed");
		}
		
		return "showMsg.jsp";
	}
}
