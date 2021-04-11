package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data

@Entity
@Table(name = "student_details")

@Component


public class LoginEntity {

	@Id
	@Column(name = "studID")
	private int studID;
	
	@Column(name = "studUSN")
	private String studUSN;
	
	@Column(name = "studDOB")
	private String studDOB;
}
