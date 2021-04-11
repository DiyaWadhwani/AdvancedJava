package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.SubjectsDTO;
import com.wolken.wolkenapp.entity.SubjectsEntity;

public interface SubjectService {
	
	public String validateSubjectAndAdd(SubjectsDTO subjectsDTO);
	public List <SubjectsEntity> validateTypeAndReturn (String subType);

}
