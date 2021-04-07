package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Component

@Entity
@Table(name = "team_details")
public class TeamDTO {
	
	@Id
	@Column(name = "teamID")
	private int teamID;
	
	@Column(name = "teamName")
	private String teamName;
	
	@Column(name = "teamSport")
	private String teamSport;
	
	@Column(name = "teamPlayers")
	private int teamPlayers;	

}
