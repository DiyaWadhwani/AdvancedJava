package com.wolken.wolkenapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;
import com.wolken.wolkenapp.dto.GunDTO;

public class GunDAOImpl implements GunDAO {
	
	int rows = 0;
	int result = 0;
	GunDTO returnDTOobj = new GunDTO();
	GunDTO gunDTO = new GunDTO();
	
	public GunDTO add(GunDTO gunDTO) {
		
		try(Connection con = DriverManager.getConnection("*****");) {
			try (PreparedStatement ps = con.prepareStatement("INSERT INTO gun_details VALUES (?,?,?,?,?,?,?,?)");) {
				
				ps.setInt(1, gunDTO.getGunID());
				ps.setString(2, gunDTO.getGunName());
				ps.setDouble(3, gunDTO.getGunPrice());
				ps.setString(4, gunDTO.getGunSerialNum());
				ps.setString(5, gunDTO.getGunBrand());
				ps.setString(6, gunDTO.getGunType());
				ps.setInt(7, gunDTO.getGunBullets());
				ps.setString(8, gunDTO.getGunCountry());
				
				rows = ps.executeUpdate();
				
				if(rows > 0) {
					returnDTOobj = gunDTO;
				}
				else 
					returnDTOobj = null;
				
				ps.close();
			}
			
			con.close();
		} 
		
		catch (SQLException e) {
			System.out.println(e.toString());
			returnDTOobj = null;
		}
		return gunDTO;
		
	}
	
//	public GunDTO updateBySerialNum(String gunSerialNum) {
//		
//		Scanner sc = new Scanner (System.in);
//		
//		try (Connection con = DriverManager
//				.getConnection("jdbc:mysql://localhost:3306/wolken?user=root&password=NewPassword@WolkenOkta01");) {
//			try (PreparedStatement ps = con
//					.prepareStatement("UPDATE gun_details SET gunType = ? WHERE gunSerialNum = ?");) {
//				
//				System.out.println("Enter new Gun type to be updated : ");
//				ps.setString(1, sc.next());
//				ps.setString(2, gunSerialNum);
//
//				rows = ps.executeUpdate();
//
//				ps.close();
//			}
//
//			con.close();
//		}
//
//		catch (SQLException e) {
//			System.out.println(e.toString());
//		}
//
//		return rows;
//
//	}
	
	public void displayByBrand(String gunBrand) {

		try (Connection con = DriverManager
				.getConnection("*****");) {
			try (PreparedStatement ps = con.prepareStatement("SELECT * FROM gun_details WHERE gunBrand = ?");) {
				ps.setString(1, gunBrand);

				try (ResultSet rs = ps.executeQuery()) {
					
					result = 0;

					while (rs.next()) {

						result++;
						
						gunDTO.setGunID(rs.getInt("gunID"));
						gunDTO.setGunName(rs.getString("gunName"));
						gunDTO.setGunPrice(rs.getDouble("gunPrice"));
						gunDTO.setGunSerialNum(rs.getString("gunSerialNum"));
						gunDTO.setGunBrand(rs.getString("gunBrand"));
						gunDTO.setGunType(rs.getString("gunType"));
						gunDTO.setGunBullets(rs.getInt("gunBullets"));
						gunDTO.setGunCountry(rs.getString("gunCountry"));

						System.out.println("\nDatabase Entry " + result);
						if (gunDTO != null) {
							System.out.println("\nID : " + gunDTO.getGunID());
							System.out.println("Gun Name : " + gunDTO.getGunName());
							System.out.println("Price : " + gunDTO.getGunPrice());
							System.out.println("Serial Number : " + gunDTO.getGunSerialNum());
							System.out.println("Brand : " + gunDTO.getGunBrand());
							System.out.println("Type : " + gunDTO.getGunType());
							System.out.println("No. Of Bullets : " + gunDTO.getGunBullets());
							System.out.println("Country : " + gunDTO.getGunCountry());
						}
						else
						{
							System.out.println("Database is empty");
						}

					}
					rs.close();
				}
				ps.close();
			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println(e.toString());

		}
	}
	
	public void displayByCountry(String gunCountry) {

		try (Connection con = DriverManager
				.getConnection("****");) {
			try (PreparedStatement ps = con.prepareStatement("SELECT * FROM gun_details WHERE gunCountry = ?");) {
				ps.setString(1, gunCountry);

				try (ResultSet rs = ps.executeQuery()) {
					
					result = 0;

					while (rs.next()) {

						result++;
						
						gunDTO.setGunID(rs.getInt("gunID"));
						gunDTO.setGunName(rs.getString("gunName"));
						gunDTO.setGunPrice(rs.getDouble("gunPrice"));
						gunDTO.setGunSerialNum(rs.getString("gunSerialNum"));
						gunDTO.setGunBrand(rs.getString("gunBrand"));
						gunDTO.setGunType(rs.getString("gunType"));
						gunDTO.setGunBullets(rs.getInt("gunBullets"));
						gunDTO.setGunCountry(rs.getString("gunCountry"));

						System.out.println("\nDatabase Entry " + result);
						if (gunDTO != null) {
							System.out.println("\nID : " + gunDTO.getGunID());
							System.out.println("Gun Name : " + gunDTO.getGunName());
							System.out.println("Price : " + gunDTO.getGunPrice());
							System.out.println("Serial Number : " + gunDTO.getGunSerialNum());
							System.out.println("Brand : " + gunDTO.getGunBrand());
							System.out.println("Type : " + gunDTO.getGunType());
							System.out.println("No. Of Bullets : " + gunDTO.getGunBullets());
							System.out.println("Country : " + gunDTO.getGunCountry());
						}
						else
						{
							System.out.println("Database is empty");
						}

					}
					rs.close();
				}
				ps.close();
			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println(e.toString());

		}
	}
	
	public void displayAll() {

		try (Connection con = DriverManager
				.getConnection("****");) {
			try (PreparedStatement ps = con.prepareStatement("SELECT * FROM gun_details");) {
				try (ResultSet rs = ps.executeQuery()) {
					
					result = 0;
					
					while (rs.next()) {

						result++;

						gunDTO.setGunID(rs.getInt("gunID"));
						gunDTO.setGunName(rs.getString("gunName"));
						gunDTO.setGunPrice(rs.getDouble("gunPrice"));
						gunDTO.setGunSerialNum(rs.getString("gunSerialNum"));
						gunDTO.setGunBrand(rs.getString("gunBrand"));
						gunDTO.setGunType(rs.getString("gunType"));
						gunDTO.setGunBullets(rs.getInt("gunBullets"));
						gunDTO.setGunCountry(rs.getString("gunCountry"));

						System.out.println("\nDatabase Entry " + result);
						if (gunDTO != null) {
							System.out.println("\nID : " + gunDTO.getGunID());
							System.out.println("Gun Name : " + gunDTO.getGunName());
							System.out.println("Price : " + gunDTO.getGunPrice());
							System.out.println("Serial Number : " + gunDTO.getGunSerialNum());
							System.out.println("Brand : " + gunDTO.getGunBrand());
							System.out.println("Type : " + gunDTO.getGunType());
							System.out.println("No. Of Bullets : " + gunDTO.getGunBullets());
							System.out.println("Country : " + gunDTO.getGunCountry());
						}
						else
						{
							System.out.println("Database is empty");
						}

					}
					rs.close();
				}
				ps.close();
			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println(e.toString());
		}

	}
	
public int deleteByID(int gunID) {
		
		try (Connection con = DriverManager
				.getConnection("****");) {
			try (PreparedStatement ps = con.prepareStatement("DELETE FROM gun_details WHERE gunID = ?");) {
				ps.setInt(1, gunID);
				
				rows = ps.executeUpdate();
				
				ps.close();
			}
			con.close();
		}

		catch (SQLException e) {
			System.out.println(e.toString());
		}

		return rows;
	}


public int deleteAll() {
	
	try (Connection con = DriverManager
			.getConnection("*****");) {
		try (PreparedStatement ps = con.prepareStatement("TRUNCATE TABLE gun_details");) {
			
			rows = ps.executeUpdate();
			
			ps.close();
		}
		con.close();
	}

	catch (SQLException e) {
		System.out.println(e.toString());
	}

	return rows;
}
	
	
	
}
	
//	if (rows <= 0) {
//		System.out.println(
//				"No gun with Brand " + gunBrand + " exists yet\nEnter 1 to add a new gun to the database");
//	}
//		
//		
//	}
