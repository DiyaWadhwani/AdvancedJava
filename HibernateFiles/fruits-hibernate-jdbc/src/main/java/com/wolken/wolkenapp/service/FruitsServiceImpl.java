package com.wolken.wolkenapp.service;

import java.util.ArrayList;
import java.util.List;

import com.wolken.wolkenapp.dao.FruitsDAO;
import com.wolken.wolkenapp.dao.FruitsDAOImpl;
import com.wolken.wolkenapp.dto.FruitsDTO;

public class FruitsServiceImpl implements FruitsService {
	
	FruitsDAO fruitsDAO = new FruitsDAOImpl();
	
	public void validateAndAdd(FruitsDTO fruitsDTO) {
		
		if(fruitsDTO != null) {
			fruitsDAO.add(fruitsDTO);
		}
		
		else {
			System.out.println("Object is null");
		}
	}
	
//	public void validateAndUpdate(FruitsDTO fruitsDTO) {
//		
//		if(fruitsDTO != null) {
//			fruitsDAO.update(fruitsDTO);
//		}
//		
//		else {
//			System.out.println("Object is null");
//		}
//	}
	
	public void validateAndUpdateByID(FruitsDTO fruitsDTO) {
		
		if(fruitsDTO != null ) {
			fruitsDAO.updateByID(fruitsDTO);
		}
		else {
			System.out.println("Object is null");
		}
	}
	
	public void validateAndUpdateByName(String fruitName, String fruitColor, double fruitPrice) {
		
		if(fruitName.length()>0 && fruitColor.length()>0 && fruitPrice >0) {
			fruitsDAO.updateByName(fruitName, fruitColor, fruitPrice);
		}
		else {
			System.out.println("Some error has occured !!");
		}
	}
	
	public void validateAndUpdateByColor(String fruitColor, String fruitName, double fruitPrice) {
		
		if(fruitName.length()>0 && fruitColor.length()>0 && fruitPrice >0) {
			fruitsDAO.updateByColor(fruitColor, fruitName, fruitPrice);
		}
		else {
			System.out.println("Some error has occured !!");
		}
	}
	

	@Override
	public void validateAndUpdateByPrice(double fruitPrice, String fruitName, String fruitColor) {
		
		if(fruitName.length()>0 && fruitColor.length()>0 && fruitPrice >0) {
			fruitsDAO.updateByPrice(fruitPrice, fruitName, fruitColor);
		}
		else {
			System.out.println("Some error has occured !!");
		}
	}
	
	public void validateAndDeleteByID(int fruitID) {
		
		if(fruitID != 0) {
			fruitsDAO.deleteByID(fruitID);
		}
		
		else {
			System.out.println("Object is null");
		}
	}

	@Override
	public List<FruitsDTO> validateAndDisplayAll() {
		
		 return fruitsDAO.displayAll();
		 
	}

	

}
