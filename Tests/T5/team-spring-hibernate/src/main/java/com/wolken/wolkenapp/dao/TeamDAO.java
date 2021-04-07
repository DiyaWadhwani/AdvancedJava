package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.TeamDTO;

public interface TeamDAO {
	
	public int addTeam(TeamDTO teamDTO);
	public List<TeamDTO> displayTeams();
	public int updateByID(TeamDTO teamDTO);
	public int updateByName(String teamName, String teamSport, int teamPlayers);
	public int deleteByID(int teamID);
	public int deleteByName(String teamName);
}
