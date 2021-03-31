package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dto.LibraryDTO;

public interface LibraryService {
	
	public void validateAndInsert(LibraryDTO libraryDTO);
	public List<LibraryDTO> validateAndDisplay();
	public void validateAndUpdateByID(LibraryDTO libraryDTO);
	public void validateAndUpdateByName(String bookName, int bookPages, double bookPrice);
	public void validateAndDeleteByID(String bookID);
	public void validateAndDeleteByName(String bookName);

}
