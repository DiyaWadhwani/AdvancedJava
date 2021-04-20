package com.wolken.wolkenapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wolken.wolkenapp.entity.ShopperEntity;
import com.wolken.wolkenapp.repository.ShopperRepo;

@Service
@Transactional
public class ShopperServiceImpl implements ShopperService {
		
	
	@Autowired
	ShopperRepo shopperRepo;
	
	public List<ShopperEntity> validateAndFindAll() {
		
		return shopperRepo.findAll();
	}
	
	public List<ShopperEntity> validateAndFindByShopperAge(int shopperAge) {
		
		return shopperRepo.findByShopperAge(shopperAge);
	}
	
	public ShopperEntity validateAndFindByShopperName(String shopperName) {
		
		return shopperRepo.findByShopperName(shopperName);
	}
	
	public String validateAndAddNewShopper(ShopperEntity shopperEntity) {
		
		shopperRepo.save(shopperEntity);
		return "New Shopper " + shopperEntity.getShopperName() + " added to List";
	}
	
	public String validateAndUpdateShopperContactByEmail(long shopperContact, String shopperEmail) {
		
		String message = "";
		ShopperEntity se = shopperRepo.findByShopperEmail(shopperEmail);
		
		if(se != null) {
			se.setShopperContact(shopperContact);
			shopperRepo.save(se);
			message = "Update executed !";
		}
		else {
			message = "Update failed, incorrect email entered. Please try again";
		}
		return message;
	}
	
	public String validateAndDeleteShopperByName(String shopperName) {
		shopperRepo.deleteByShopperName(shopperName);
		return "Shopper " + shopperName + " does not exist in the List";
	}
	
	public String validateAndDeleteByID(int shopperID) {
		shopperRepo.deleteById(shopperID);
		return "Shopper with ID" + shopperID + " does not exist in the List";
	}
}
