package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.entity.SubjectsEntity;

public interface SubjectDAO {
	
	public void addSubject (SubjectsEntity subjectsEntity);
	public List<SubjectsEntity> getSubDetailsByType (String subType);

}
