package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.dto.GunDTO;

public interface GunService {
	
	public void validateAndAdd(GunDTO gunDTO);
	public void validateBrandAndDisplay(String gunBrand);
	public void validateCountryAndDisplay(String gunCountry);
	public void displayAll();
	public void validateIDAndDelete(int gunID);
	public void deleteAll();
}
