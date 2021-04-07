package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamDTO;

public interface TeamService {
	
	public int validateAndAdd(TeamDTO teamDTO);
	public List<TeamDTO> validateAndDisplay();
	public int validateAndUpdateByID(TeamDTO teamDTO);
	public int validateAndUpdateByName(String teamName, String teamSport, int teamPlayers);
	public int validateAndDeleteByID(int teamID);
	public int validateAndDeleteByName(String teamName);
}
