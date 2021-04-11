package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.custom.DOBLoginException;
import com.wolken.wolkenapp.custom.NoUserFoundException;
import com.wolken.wolkenapp.custom.USNLoginException;
import com.wolken.wolkenapp.dao.LoginDAO;
import com.wolken.wolkenapp.dto.LoginDTO;
import com.wolken.wolkenapp.entity.LoginEntity;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDAO loginDAO;
	
	Logger logger = Logger.getLogger(LoginDTO.class);
	
	public String validateAndLogin(LoginDTO loginDTO) {
		
		String message = null;
		
		try {
			
			if(loginDTO != null) {
				LoginEntity le = loginDAO.loginUser(loginDTO.getStudUSN());
				
				if(le != null) {
					
					if(le.getStudUSN().equals(loginDTO.getStudUSN())) {
						
						if(le.getStudDOB().equals(loginDTO.getStudDOB())) {
							message = "User verified. Login Successful";
						}
						else {
							throw new DOBLoginException();
						}
					}
					else {
						throw new USNLoginException();
					}
				}
				else {
					throw new NoUserFoundException();
				}
			}
			
		}
		
		catch (DOBLoginException | USNLoginException | NoUserFoundException e) {
			logger.error(e.toString());
			logger.warn("Please Try Again");
			message = e.toString();
		}
		
		return message;
	}

}
