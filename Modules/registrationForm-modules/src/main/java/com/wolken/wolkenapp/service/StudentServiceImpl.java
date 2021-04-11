package com.wolken.wolkenapp.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.custom.BacklogException;
import com.wolken.wolkenapp.custom.EmailException;
import com.wolken.wolkenapp.custom.GPAException;
import com.wolken.wolkenapp.custom.NameException;
import com.wolken.wolkenapp.custom.USNException;
import com.wolken.wolkenapp.dao.StudentDAO;
import com.wolken.wolkenapp.dto.StudentDTO;
import com.wolken.wolkenapp.entity.StudentEntity;

//@Component
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	Logger logger = Logger.getLogger(StudentDTO.class);
	
	public String validateAndRegister (StudentDTO studentDTO) {
		
		StudentEntity studentEntity = new StudentEntity();
		String message = null;
		
		try {
			if(studentDTO != null) {
				
				if(studentDTO.getStudUSN().length() < 10 || studentDTO.getStudUSN().length() > 20) {
					throw new USNException();
				}
				if(studentDTO.getStudName().length() < 3 || studentDTO.getStudName().length() > 45) {
					throw new NameException();
				}
				if(studentDTO.getStudEmail().length() < 10 || studentDTO.getStudEmail().length() > 45 ) {
					throw new EmailException();
				}
				if(studentDTO.getStudGPA() < 4 || studentDTO.getStudGPA() > 10) {
					throw new GPAException();
				}
				if(studentDTO.getStudBacks() < 0 || studentDTO.getStudBacks() > 5) {
					throw new BacklogException();
				}
				else {
					
					StudentEntity se = studentDAO.getStudentByName(studentDTO.getStudName());
					
					if(se != null){
						
						logger.warn("Student registration already exists");
						message = "Registration of "+studentDTO.getStudName()+" has already been done";
					}
					else {
						studentEntity.setStudUSN(studentDTO.getStudUSN());
						studentEntity.setStudName(studentDTO.getStudName());
						studentEntity.setStudEmail(studentDTO.getStudEmail());
						studentEntity.setStudDOB(studentDTO.getStudDOB());
						studentEntity.setStudBranch(studentDTO.getStudBranch());
						studentEntity.setStudGPA(studentDTO.getStudGPA());
						studentEntity.setStudBacks(studentDTO.getStudBacks());
						studentEntity.setStudGrad(studentDTO.getStudGrad());
						
						studentDAO.newRegistration(studentEntity);
						message = "New Registration Completed";
					}
					
				}
			}
			else {
				logger.warn("Object passed is null");
				message = "Registration failed !";
			}
		}
		catch(USNException | NameException | EmailException | GPAException | BacklogException e) {
			logger.info(e.toString());
			logger.error("Registration failed");
		}
		
		return message;
		
	}

}
