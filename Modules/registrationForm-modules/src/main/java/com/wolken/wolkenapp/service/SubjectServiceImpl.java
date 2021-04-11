package com.wolken.wolkenapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.custom.SubCodeException;
import com.wolken.wolkenapp.custom.SubNameException;
import com.wolken.wolkenapp.custom.SubSeatException;
import com.wolken.wolkenapp.dao.SubjectDAO;
import com.wolken.wolkenapp.dto.SubjectsDTO;
import com.wolken.wolkenapp.entity.SubjectsEntity;

@Service
public class SubjectServiceImpl implements SubjectService {
	
	@Autowired
	SubjectDAO subjectDAO;
	
	Logger logger = Logger.getLogger(SubjectsDTO.class);
	
	public String validateSubjectAndAdd(SubjectsDTO subjectsDTO) {
		
		String message = null;
		SubjectsEntity subjectsEntity = new SubjectsEntity();
		
		try {
			if(subjectsDTO != null) {
				
				if(subjectsDTO.getSubCode().length() < 5) {
					throw new SubCodeException();
				}
				
				if(subjectsDTO.getSubName().length() < 2) {
					throw new SubNameException();
				}
				if(subjectsDTO.getSubSeats() < 0) {
					throw new SubSeatException();
				}
				
				else {
					subjectsEntity.setSubCode(subjectsDTO.getSubCode());
					subjectsEntity.setSubName(subjectsDTO.getSubName());
					subjectsEntity.setSubType(subjectsDTO.getSubType());
					subjectsEntity.setSubSeats(subjectsDTO.getSubSeats());
					subjectDAO.addSubject(subjectsEntity);
					message = "New subject has been added successfully";
				}
			}
			else {
				logger.warn("Object passed is null");
				message = "Could not add Subject";
			}
		}
		
		catch(SubCodeException | SubNameException | SubSeatException e) {
			logger.info(e.toString());
			logger.error("New additions failed");
			message = "Exception occured";
		}
		
		return message;
		
	}
	
	public List <SubjectsEntity> validateTypeAndReturn (String subType) {
		
		List <SubjectsEntity> subjectList = subjectDAO.getSubDetailsByType(subType);
		
		if(subjectList.isEmpty()) {
			logger.warn("No subjects with type "+subType+" exists");
			logger.error("Subject details could not be fetched");
		}
		return subjectList;
	}

}
