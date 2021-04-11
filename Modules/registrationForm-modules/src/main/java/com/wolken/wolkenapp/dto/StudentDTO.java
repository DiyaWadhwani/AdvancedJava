package com.wolken.wolkenapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class StudentDTO {
	
	private String studUSN;
	private String studName;
	private String studEmail;
	private String studDOB;
	private String studBranch;
	private float studGPA;
	private int studBacks;
	private int studGrad;
	
}
