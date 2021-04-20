package com.wolken.wolkenapp.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.dto.ColStudDTO;
import com.wolken.wolkenapp.entity.CollegeEntity;
import com.wolken.wolkenapp.entity.StudentEntity;
import com.wolken.wolkenapp.repository.ColRepo;
import com.wolken.wolkenapp.repository.StudRepo;

@Service
public class ColStudServiceImpl implements ColStudService {
	
	@Autowired
	StudRepo studRepo;
	
	@Autowired
	ColRepo colRepo;
	
	Logger logger = LoggerFactory.getLogger(ColStudServiceImpl.class);
	
	public List<StudentEntity> validateAndFindAllStudents() {

		return studRepo.findAll();
	}
	
	public List<StudentEntity> validateAndFindAllStudentsByStudAge(int studAge) {
		
		return studRepo.findAllByStudAge(studAge);
	}
	
	public List<StudentEntity> validateAndFindAllByNameOrEmail(String studName, String studEmail) {
	 
	 return studRepo.findAllByStudNameOrStudEmail(studName, studEmail);
 }
	
	public List<StudentEntity> validateAndFindAllByNameOrEmailOrDOBOrContact(String studName, String studEmail, String studDOB, long studContact) {
		return studRepo.findAllByStudNameOrStudEmailOrStudDOBOrStudContact(studName, studEmail, studDOB, studContact);
		
	}
	
	public CollegeEntity validateAndAddNewCollege(CollegeEntity collegeEntity) {

		return colRepo.save(collegeEntity);
	}
	
	public StudentEntity validateAndAddNewStudent(ColStudDTO colStudDTO) {

		
		CollegeEntity collegeEntity = colRepo.findByColName(colStudDTO.getColName());
		StudentEntity studentEntity = new StudentEntity();
		
		studentEntity.setStudID(colStudDTO.getStudID());
		studentEntity.setStudName(colStudDTO.getStudName());
		studentEntity.setStudAge(colStudDTO.getStudAge());
		studentEntity.setStudDOB(colStudDTO.getStudDOB());
		studentEntity.setStudEmail(colStudDTO.getStudEmail());
		studentEntity.setStudContact(colStudDTO.getStudContact());
		studentEntity.setCol(collegeEntity);
		System.out.println(studentEntity);
		
		return studRepo.save(studentEntity);
	}



	@Override
	public List<StudentEntity> validateAndAddStudentList(ColStudDTO[] colStudDTOs) {
		
		List<StudentEntity> studentEntityList = new ArrayList<StudentEntity>();
		
		for(ColStudDTO dto : colStudDTOs) {
			CollegeEntity collegeEntity = colRepo.findByColName(dto.getColName());
			StudentEntity studentEntity = new StudentEntity();
			
			studentEntity.setStudID(dto.getStudID());
			studentEntity.setStudName(dto.getStudName());
			studentEntity.setStudAge(dto.getStudAge());
			studentEntity.setStudContact(dto.getStudContact());
			studentEntity.setStudDOB(dto.getStudDOB());
			studentEntity.setStudEmail(dto.getStudEmail());
			studentEntity.setCol(collegeEntity);
			
			studRepo.save(studentEntity);
			
			studentEntityList.add(studentEntity);
		}
		return studentEntityList;
	}
	
	public CollegeEntity validateAndUpdateZipByArea(String colArea, int colZip) {
		
		CollegeEntity collegeEntity = colRepo.findByColArea(colArea);
				
		collegeEntity.setColZip(colZip);
		
		return colRepo.save(collegeEntity);
	}


}
