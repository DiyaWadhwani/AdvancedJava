package com.wolken.wolkenapp;

import java.util.Scanner;

//import com.wolken.wolkenapp.custom.NullMobileException;
import com.wolken.wolkenapp.dao.MobileDAO;
import com.wolken.wolkenapp.dao.MobileDAOImpl;
import com.wolken.wolkenapp.dto.MobileDTO;
import com.wolken.wolkenapp.service.MobileService;
import com.wolken.wolkenapp.service.MobileServiceImpl;

public class MobileTester {
	
	
	 MobileDAO mobileDAO = new MobileDAOImpl();
	
	public void enterDeets() {
		MobileDTO mobileDTO = new MobileDTO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Brand :");
		String brand = sc.next();
		mobileDTO.setMobBrand(brand);
		
		System.out.println("Enter Mobile ID :");
		int id = sc.nextInt();
		mobileDTO.setMobID(id);
		
		System.out.println("Enter Mobile Model :");
		String model = sc.next();
		mobileDTO.setMobModel(model);
		
		System.out.println("Enter Price :");
		double price = sc.nextDouble();
		mobileDTO.setMobPrice(price);
		
		System.out.println("Enter Serial Number :");
		long serialNum = sc.nextLong();
		mobileDTO.setMobSerialNum(serialNum);
		
		System.out.println("Enter Memory Storage :");
		int mem = sc.nextInt();
		mobileDTO.setMobMemory(mem);
		
		System.out.println("Enter No. of Cameras :");
		int cams = sc.nextInt();
		mobileDTO.setMobNoOfCams(cams);
		
		MobileService mobileService = new MobileServiceImpl();
		
		boolean valid = mobileService.validate(mobileDTO);
		
		if(valid) {
			boolean newObj = mobileDAO.add(mobileDTO);
			
			if(newObj) {
				System.out.println("All entries are valid\nNew item added");
			}
			else
				System.out.println("Could not add new item");
		}
		else
			System.out.println("Could not add new item\nEnter 1 to add a new valid entry");
		}
	
	public static void main(String[] args) { 

	MobileTester mobileTester = new MobileTester();
	MobileDTO mobileDTO = new MobileDTO();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("\nList of options :\n1 - Add a new item\n2 - Update item by Serial Number\n3 - Display items by Brand\n4 - Display all items\n5 - Delete items by Mobile ID\n6 - Exit\nEnter your choice : ");
			int ch = sc.nextInt();
			switch (ch) {
				
			case 1 : mobileTester.enterDeets();
					 break;
					 					 
			case 2 : System.out.println("Enter Serial Number of item to be updated : ");
					 long serial = sc.nextLong();
					 mobileDTO = mobileTester.mobileDAO.updateBySerialNum(serial);
					 if(mobileDTO != null)
						 mobileTester.mobileDAO.displayMobDeets(mobileDTO);
					 else
						 System.out.println("No entry with Serial Number "+serial+" exists yet\nEnter 1 to add an item");
					 break;
								 
			case 3 : System.out.println("Enter Brand of item to be displayed : ");
					 String brand = sc.next();
					 mobileTester.mobileDAO.getAllByBrandName(brand);
					 break;
					 
			case 4 : mobileTester.mobileDAO.getAll();
					 break;
					 
			case 5 : System.out.println("Enter Mobile ID of item to be deleted : ");
					 int id = sc.nextInt();
					 mobileDTO = mobileTester.mobileDAO.deleteByMobID(id);
					 if(mobileDTO == null)
						 System.out.println("No entry with ID "+id+" exists yet\nEnter 1 to add an item");
					 break;
					 
			case 6 : System.exit(0);
					 break;
			
			default : System.out.println("This choice does not exist !!");
					  break;
			}
		}
	}
}
