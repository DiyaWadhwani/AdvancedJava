package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

@Entity
@Table (name = "subject_details")
public class SubjectsEntity {

	@Id
	@Column(name = "subID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subID;
	
	@Column(name = "subCode")
	private String subCode;
	
	@Column(name = "subName")
	private String subName;
	
	@Column(name = "subType")
	private String subType;
	
	@Column(name = "subSeats")
	private int subSeats;
	
}
