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
@Table(name = "college_details")
@Getter
@Setter
public class CollegeEntity {
	
	@Id
	@Column(name = "col_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int colID;
	
	@Column(name = "col_name")
	private String colName;
	
	@Column(name = "col_area")
	private String colArea;
	
	@Column(name = "col_zip")
	private int colZip;
	
	@OneToOne
	@JoinColumn(name = "col_id")
	@JsonIgnoreProperties("col")
	private StudentEntity stud;

}
