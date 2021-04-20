package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.ColStudDTO;
import com.wolken.wolkenapp.entity.CollegeEntity;
import com.wolken.wolkenapp.entity.StudentEntity;

public interface ColStudService {
	
	public List<StudentEntity> validateAndFindAllStudents();
	public List<StudentEntity> validateAndFindAllStudentsByStudAge(int studAge);
	public List<StudentEntity> validateAndFindAllByNameOrEmail(String studName, String studEmail);
	public List<StudentEntity> validateAndFindAllByNameOrEmailOrDOBOrContact(String studName, String studEmail, String studDOB, long studContact);
	public CollegeEntity validateAndAddNewCollege(CollegeEntity collegeEntity);
	public StudentEntity validateAndAddNewStudent(ColStudDTO colStudDTO);
	public List<StudentEntity> validateAndAddStudentList(ColStudDTO[] colStudDTOs);
	public CollegeEntity validateAndUpdateZipByArea(String colArea, int colZip);
}
