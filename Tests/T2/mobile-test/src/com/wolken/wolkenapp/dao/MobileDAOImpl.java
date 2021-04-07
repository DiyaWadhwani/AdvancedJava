package com.wolken.wolkenapp.dao;

import java.util.*;
import java.util.Scanner;
import com.wolken.wolkenapp.dto.MobileDTO;

public class MobileDAOImpl implements MobileDAO {
	
	public MobileDTO mobileDTO;
	public List<MobileDTO> listMobileDTO = new ArrayList<MobileDTO>();
	public int index=0;
	
		
	@Override
	public boolean add(MobileDTO mobDTO) {
		if (mobDTO != null) {
			this.listMobileDTO.add(mobDTO);
			return true;
		}
		
		return false;
	}

	@Override
	public void getAll() { 
		
		if(this.listMobileDTO.isEmpty()) {
			System.out.println("No entries exist yet \nEnter 1 to add an item");
		}
		else {
			for (MobileDTO mobileDTO : this.listMobileDTO) {
				
				displayMobDeets(mobileDTO);
			}
		}
	}

	@Override
	public MobileDTO deleteByMobID(int id) {
		
		Scanner sc = new Scanner(System.in);
		MobileDTO mobDTO = new MobileDTO();
		
		if(listMobileDTO.isEmpty()) {
			System.out.println("List is empty, no entries exist yet !!");
			mobDTO = null;
		}
		for (MobileDTO mdto : listMobileDTO) {
			
			if(mdto.getMobID() == id)
			{
				listMobileDTO.remove(mdto);
				System.out.println("Item with ID "+id+" has been deleted");
				mobDTO = mdto;
				return mobDTO;
			}
			else
				mobDTO = null;
		}
		return mobDTO;
	}

	@Override
	public MobileDTO updateBySerialNum(long serialNum) {
		
		Scanner sc = new Scanner(System.in);
		MobileDTO mobDTO = new MobileDTO();
		
		if(listMobileDTO.isEmpty()) {
			System.out.println("List is empty, no entries exist yet !!");
			mobDTO = null;
		}
		
		for (MobileDTO mdto : listMobileDTO) {
			
			if(mdto.getMobSerialNum() == serialNum)
			{
				System.out.println("Enter new Serial Number to be updated : ");
				long serial = sc.nextLong();
				mdto.setMobSerialNum(serial);
				System.out.println("Item has been updated :");
				mobDTO = mdto;
				return mobDTO;
			}
			else
				mobDTO = null;
		}
		return mobDTO;
	}

	@Override
	public void getAllByBrandName(String brand) {
		
		MobileDTO mobileDTO = new MobileDTO();
		
		if(listMobileDTO.isEmpty()) {
			System.out.println("List is empty, no entries exist yet !!");
		}
		
		for(MobileDTO mobDTO : listMobileDTO) {
			if(mobDTO.getMobBrand().equals(brand)) {
				mobileDTO = mobDTO; 
				displayMobDeets(mobileDTO);
			}
			if(! mobDTO.getMobBrand().contains(brand)) {
				System.out.println("No item with Brand "+brand+" exists !");
			}
		}
	}
	
	public void displayMobDeets(MobileDTO obj1) {
		
		MobileDTO obj = (MobileDTO) obj1;
		if(obj1 == null)
			System.out.println("No obj");
		System.out.println("\nBrand : "+obj.getMobBrand()+"\nID : "+obj.getMobID()+"\nModel : "+obj.getMobModel()+"\nPrice : Rs."+obj.getMobPrice()+"\nSerial Number : "+obj.getMobSerialNum()+"\nMemory : "+obj.getMobMemory()+" GB\nNo. Of Cameras : "+obj.getMobNoOfCams());
	}


	
}
