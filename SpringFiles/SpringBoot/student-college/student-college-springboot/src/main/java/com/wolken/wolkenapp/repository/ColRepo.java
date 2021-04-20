package com.wolken.wolkenapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenapp.entity.CollegeEntity;

public interface ColRepo extends JpaRepository<CollegeEntity, Integer>{

	public CollegeEntity findByColName(String colName);
	public CollegeEntity findByColArea(String colArea);
}
