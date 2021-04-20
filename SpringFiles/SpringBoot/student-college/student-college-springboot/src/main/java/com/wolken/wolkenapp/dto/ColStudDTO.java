package com.wolken.wolkenapp.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ColStudDTO {

	private int studID;
	private String studName;
	private int studAge;
	private long studContact;
	private String studDOB;
	private String studEmail;
	
	private String colName;
	
//	private CollegeEntity col;
//	
//	public CollegeEntity getCol() {
//		
//		CollegeEntity ce = new CollegeEntity();
//		ce.setColid(col.getColid());
//		ce.setColname(col.getColname());
//		ce.setColarea(col.getColarea());
//		ce.setColzip(col.getColzip());
//		
//		return ce;
//	}
	
}
