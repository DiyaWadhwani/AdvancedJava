package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.entity.StudentEntity;

public interface StudentDAO {
	
	public void newRegistration(StudentEntity studentEntity);
	public StudentEntity getStudentByName(String studName);

}
