package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.FruitsDTO;

public interface FruitsDAO {
	
	public void add(FruitsDTO fruitsDTO);
	public void updateByID (FruitsDTO fruitsDTO);
	public void updateByName(String fruitName, String fruitColor, double fruitPrice);
	public void updateByColor(String fruitColor, String fruitName, double fruitPrice);
	public void updateByPrice(double fruitPrice, String fruitName, String fruitColor);
	public List<FruitsDTO> displayAll();
	public void deleteByID(int fruitID);
}
