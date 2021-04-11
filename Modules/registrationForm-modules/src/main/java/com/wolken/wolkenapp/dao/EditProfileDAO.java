package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.entity.EditProfileEntity;

public interface EditProfileDAO {
	
	public EditProfileEntity getStudDetailsByEmail (String studEmail);
	public int updateStudDetails (EditProfileEntity editProfileEntity);

}
