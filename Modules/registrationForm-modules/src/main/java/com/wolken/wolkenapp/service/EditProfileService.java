package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.entity.EditProfileEntity;

public interface EditProfileService {
	
	public EditProfileEntity validateEmailAndReturn(String studEmail);
	public int updateStudDetails(EditProfileEntity editProfileEntity);
}
