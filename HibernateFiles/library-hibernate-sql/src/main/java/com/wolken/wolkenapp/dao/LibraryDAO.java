package com.wolken.wolkenapp.dao;

import java.util.List;

import com.wolken.wolkenapp.dto.LibraryDTO;

public interface LibraryDAO {
	
	public void insertBook(LibraryDTO libraryDTO);
	public List<LibraryDTO> displayBooks();
	public void updateBookByID(LibraryDTO libraryDTO);
	public void updateBookByName(String bookName, int bookPages, double bookPrice);
	public void deleteBookByID(String bookID);
	public void deleteBookByName(String bookName);
}
