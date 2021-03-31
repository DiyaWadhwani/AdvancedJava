package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.FruitsDTO;

public interface FruitsService {
	
	public void validateAndAdd(FruitsDTO fruitsDTO);
//	public void validateAndUpdate(FruitsDTO fruitsDTO);
	public void validateAndUpdateByID(FruitsDTO fruitsDTO);
	public void validateAndUpdateByName(String fruitName, String fruitColor, double fruitPrice);
	public void validateAndUpdateByColor(String fruitColor, String fruitName, double fruitPrice);
	public void validateAndUpdateByPrice(double fruitPrice, String fruitName, String fruitColor);
	public List<FruitsDTO> validateAndDisplayAll();
	public void validateAndDeleteByID(int fruitID);
	
}
