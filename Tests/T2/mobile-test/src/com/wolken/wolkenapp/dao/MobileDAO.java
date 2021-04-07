package com.wolken.wolkenapp.dao;

//import com.wolken.wolkenapp.custom.NullMobileException;
import com.wolken.wolkenapp.dto.MobileDTO;

public interface MobileDAO {
	
	public boolean add(MobileDTO dto);
	public void getAll(); 
//			throws NullMobileException;
	public MobileDTO deleteByMobID(int id);
	public MobileDTO updateBySerialNum(long serialNum);
	public void getAllByBrandName(String brand);
	public void displayMobDeets(MobileDTO mobileDTO);
}
