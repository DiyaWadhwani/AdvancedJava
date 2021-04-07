package com.wolken.wolkenapp;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.wolken.wolkenapp.dto.GunDTO;
import com.wolken.wolkenapp.service.GunService;
import com.wolken.wolkenapp.service.GunServiceImpl;

public class GunTester {

	GunDTO gunDTO = new GunDTO();
	GunService gunService = new GunServiceImpl();

	public void getDetails(int n) {
		Scanner sc = new Scanner(System.in);

		try {

			for (int i = 0; i < n; i++) {

				System.out.println("Enter Gun ID : ");
				gunDTO.setGunID(sc.nextInt());

				System.out.println("Enter Gun Name : ");
				gunDTO.setGunName(sc.next());

				System.out.println("Enter Gun Price : ");
				gunDTO.setGunPrice(sc.nextDouble());

				System.out.println("Enter Gun Serial Number : ");
				gunDTO.setGunSerialNum(sc.next());

				System.out.println("Enter Gun Brand Name : ");
				gunDTO.setGunBrand(sc.next());

				System.out.println("Enter Gun Type : ");
				gunDTO.setGunType(sc.next());

				System.out.println("Enter No. of Bullets in Gun : ");
				gunDTO.setGunBullets(sc.nextInt());

				System.out.println("Enter Gun Country : ");
				gunDTO.setGunCountry(sc.next());

				GunService gunService = new GunServiceImpl();
				gunService.validateAndAdd(gunDTO);
			}
		} catch (InputMismatchException e) {
			System.out.println("Entered data differs from expected data");
		}
	}

	public static void main(String[] args) {

		GunTester gunTester = new GunTester();
		boolean run = true;

		while (run) {

			Scanner sc = new Scanner(System.in);

			try {

				System.out.println(
						"\nList of options\n1 - Add a new Gun\n2 - Update Price by Serial Number\n3 - Display database entries by Brand\n4 - Display database entries by Country\n5 - Display all Gun details in database\n6 - Delete database entries by ID\n7 - Delete all\n8 - Exit\nEnter your choice :");
				int ch = sc.nextInt();
				switch (ch) {
				
				case 1 :
					try {
						System.out.println("\nEnter number of entries :");
						int n = sc.nextInt();
						gunTester.getDetails(n);
						break;
					} catch (InputMismatchException e) {
						System.out.println("Entered data differs from expected data");
						break;
					}
					
				case 2 :
					System.out.println("Function not implemented");
					break;
				
				case 3 :
					try {
						System.out.println("Enter Brand :");
						String gunBrand = sc.next();
						gunTester.gunService.validateBrandAndDisplay(gunBrand);
						break;
					} catch (InputMismatchException e) {
						System.out.println("Entered data differs from expected data");
					}
					
				case 4:
					try {
						System.out.println("Enter Country :");
						String gunCountry = sc.next();
						gunTester.gunService.validateCountryAndDisplay(gunCountry);
						break;
					} catch (InputMismatchException e) {
						System.out.println("Entered data differs from expected data");
					}
					
				case 5:
					try {
						gunTester.gunService.displayAll();
						break;

					} catch (InputMismatchException e) {
						System.out.println("Entered data differs from expected data");
					}
					
				case 6:
					try {
						System.out.println("Enter ID :");
						int gunID = sc.nextInt();
						gunTester.gunService.validateIDAndDelete(gunID);
						break;
					} catch (InputMismatchException e) {
						System.out.println("Entered data differs from expected data");
					}
					
				case 7 :
					gunTester.gunService.deleteAll();
					break;
					
				case 8 :
					run = false;
					break;
					
				default:
					System.out.println("Enter a valid choice !!");

				}

			} catch (InputMismatchException e) {
				System.out.println("Entered data differs from expected data");
			}

		}
	}
}
