package com.wolken.wolkenapp.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.custom.EmailException;
import com.wolken.wolkenapp.dao.EditProfileDAO;
import com.wolken.wolkenapp.dto.EditProfileDTO;
import com.wolken.wolkenapp.entity.EditProfileEntity;

@Service
public class EditProfileServiceImpl implements EditProfileService {
	
	@Autowired
	EditProfileDAO editProfileDAO;
	
	Logger logger = Logger.getLogger(EditProfileDTO.class);
	
	public EditProfileEntity validateEmailAndReturn(String studEmail) {
		
		EditProfileEntity editProfileEntity = null;
		
		try {
			
			if(studEmail.length() < 10 || studEmail.length() > 45 ) {
				throw new EmailException();
			}
			else {
				editProfileEntity = editProfileDAO.getStudDetailsByEmail(studEmail);
				if(editProfileEntity == null) {
					logger.warn("No user with given email");
					logger.error("Details cannot be fetched");
				}
			}
			
		}
		catch (EmailException e) {
			logger.info(e.toString());
			logger.warn("Invalid Email provided");
		}
		
		return editProfileEntity;
		
	}
	
	public int updateStudDetails(EditProfileEntity editProfileEntity) {
		
		int rows = editProfileDAO.updateStudDetails(editProfileEntity);
		
		if (rows <= 0) {
			logger.error("Update failed");
		}
		else {
			logger.info("Update successful");
		}
		
		return rows;
	}

}
