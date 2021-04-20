package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.entity.ShopperEntity;

public interface ShopperService {
	
	public List<ShopperEntity> validateAndFindAll();
	public List<ShopperEntity> validateAndFindByShopperAge(int shopperAge);
	public ShopperEntity validateAndFindByShopperName(String shopperName);
	public String validateAndAddNewShopper(ShopperEntity shopperEntity);
	public String validateAndUpdateShopperContactByEmail(long shopperContact, String shopperEmail);
	public String validateAndDeleteShopperByName(String shopperName);
	public String validateAndDeleteByID(int shopperID);
	
	
}
