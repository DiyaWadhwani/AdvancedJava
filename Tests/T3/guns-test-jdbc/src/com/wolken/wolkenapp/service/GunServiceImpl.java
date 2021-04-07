package com.wolken.wolkenapp.service;

import com.wolken.wolkenapp.custom.BulletException;
import com.wolken.wolkenapp.custom.IDException;
import com.wolken.wolkenapp.custom.NameException;
import com.wolken.wolkenapp.custom.PriceException;
import com.wolken.wolkenapp.custom.SerialNumException;
import com.wolken.wolkenapp.dao.GunDAO;
import com.wolken.wolkenapp.dao.GunDAOImpl;
import com.wolken.wolkenapp.dto.GunDTO;

public class GunServiceImpl implements GunService{
	
	GunDAO gunDAO = new GunDAOImpl();
	int rows=0;
	
	public void validateAndAdd(GunDTO gunDTO) {
		
		
		try {
			if(gunDTO.getGunID() < 0) {
				throw new IDException();
			}
			if(gunDTO.getGunName().length() <=0 ) {
				throw new NameException();
			}
			
			if(gunDTO.getGunPrice() < 5000 || gunDTO.getGunPrice() > 500000) {
				throw new PriceException(gunDTO.getGunPrice());
			}
			
			if(gunDTO.getGunSerialNum().length() < 5) {
				throw new SerialNumException();
			}
			
			if(gunDTO.getGunBrand().length() <= 0) {
				throw new NameException();
			}
			
			if(gunDTO.getGunBullets() < 6) {
				throw new BulletException();
			}
			
		}
		catch (IDException | NameException | PriceException | SerialNumException | BulletException e) {
			System.out.println(e.toString());
			return;
		}
		
		GunDTO gDTO = new GunDTO();
		gDTO = gunDAO.add(gunDTO);
		
		if(gDTO == null) {
			System.out.println("Some error occured\nCould not GUN to database");
		}
		else {
			System.out.println("GUN added to database");
		}
		
	}
	
	public void validateBrandAndDisplay(String gunBrand) {

		try {
			if(gunBrand.length() <=0 ) {
				throw new NameException();
			}
		} catch (NameException e) {
			System.out.println(e.toString());
			return;
		}

		gunDAO.displayByBrand(gunBrand);
	}
	
	public void validateCountryAndDisplay(String gunCountry) {

		try {
			if(gunCountry.length() <=0 ) {
				throw new NameException();
			}
		} catch (NameException e) {
			System.out.println(e.toString());
			return;
		}

		gunDAO.displayByCountry(gunCountry);
	}
	
	public void displayAll() {
		
		gunDAO.displayAll();
	}
	
public void validateIDAndDelete(int gunID) {
		
		try {
			if (gunID<0) {
				throw new IDException();
			}
		} catch (IDException e) {
			System.out.println(e.toString());
			return;
		}
		
		rows = gunDAO.deleteByID(gunID);

		if (rows < 0) {
			System.out.println("Update failed - Some error has occured");
		} else {
			System.out.println("Database entry of Gun with ID "+gunID+" has been deleted !!\n" + rows
					+ " row(s)affected\nSelect 6 to view changes in database");
		}

		
	}

public void deleteAll() {
	rows = gunDAO.deleteAll();
	
	if(rows < 0) {
		System.out.println("No entries exist in database\nEnter 1 to add new item");
	}
	else {
		System.out.println("Database is now empty\n");
	}
}

}
