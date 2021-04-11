package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table (name = "student_details")
public class EditProfileEntity {
	
	@Id
	@Column(name = "studID")
	private int studID;
	
	@Column(name = "studName")
	private String studName;
	
	@Column(name = "studEmail")
	private String studEmail;
	
	@Column(name = "studGPA")
	private float studGPA;
	
	@Column(name = "studBacks")
	private int studBacks;
	
}
