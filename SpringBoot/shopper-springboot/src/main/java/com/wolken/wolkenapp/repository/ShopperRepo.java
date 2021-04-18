package com.wolken.wolkenapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wolken.wolkenapp.entity.ShopperEntity;

//@Repository
public interface ShopperRepo extends JpaRepository<ShopperEntity, Integer>{
	
	public List<ShopperEntity> findByShopperAge(int age);
	public ShopperEntity findByShopperName(String name);
	public ShopperEntity findByShopperEmail(String email);
	public void deleteByShopperName(String name);
	

}
