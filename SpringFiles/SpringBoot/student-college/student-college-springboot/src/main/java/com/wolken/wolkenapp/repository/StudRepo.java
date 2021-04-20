package com.wolken.wolkenapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenapp.dto.ColStudDTO;
import com.wolken.wolkenapp.entity.StudentEntity;

public interface StudRepo extends JpaRepository<StudentEntity, Integer>{

	public StudentEntity findByStudName(String studName);
	public List<StudentEntity>findAllByStudAge(int studAge);
	public List<StudentEntity> findAllByStudNameOrStudEmail(String studName, String studEmail);
	public List<StudentEntity> findAllByStudNameOrStudEmailOrStudDOBOrStudContact(String studName, String studEmail, String studDOB, long studContact);
}
