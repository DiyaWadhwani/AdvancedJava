package com.wolken.wolkenapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

@Entity
@Table(name = "student_details")

@Component


public class StudentEntity {
	
	@Id
	@Column(name = "studID")
	
//	@GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
//	@GenericGenerator(name = "native", strategy = "native")
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studID;
	
	@Column(name = "studUSN")
	private String studUSN;
	
	@Column(name = "studName")
	private String studName;
	
	@Column(name = "studEmail")
	private String studEmail;
	
	@Column(name = "studBranch")
	private String studBranch;
	
	@Column(name = "studGPA")
	private float studGPA;
	
	@Column(name = "studBacks")
	private int studBacks;
	
	@Column(name = "studGrad")
	private int studGrad;
}
