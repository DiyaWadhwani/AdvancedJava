package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student_details")
@Getter
@Setter
public class StudentEntity {
	
	@Id
	@Column(name = "stud_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studID;
	
	@Column(name = "stud_name")
	private String studName;
	
	@Column(name = "stud_age")
	private int studAge;
	
	@Column(name = "stud_contact")
	private long studContact;
	
	@Column(name = "stud_dob")
	private String studDOB;
	
	@Column(name = "stud_email")
	private String studEmail;
	
//	@Column(name = "col_name")
//	private String col_name;
	
	@OneToOne
//	@JoinColumn(name = "col_id")
	@JsonIgnoreProperties("stud")
	private CollegeEntity col;
}
