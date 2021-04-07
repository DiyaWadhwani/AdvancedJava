package com.wolken.wolkenapp.dao;

import com.wolken.wolkenapp.dto.GunDTO;

public interface GunDAO {
	
	public GunDTO add(GunDTO gunDTO);
	public void displayByBrand(String gunBrand);
	public void displayByCountry(String gunCountry);
	public void displayAll();
	public int deleteByID(int gunID);
	public int deleteAll();

}
