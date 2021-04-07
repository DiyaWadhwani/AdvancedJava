package com.wolken.wolkenapp.service;

import java.util.List;

import com.wolken.wolkenapp.dao.LibraryDAO;
import com.wolken.wolkenapp.dao.LibraryDAOImpl;
import com.wolken.wolkenapp.dto.LibraryDTO;
import com.wolken.wolkenapp.exceptions.IDException;
import com.wolken.wolkenapp.exceptions.NameException;
import com.wolken.wolkenapp.exceptions.PageException;
import com.wolken.wolkenapp.exceptions.PriceException;

public class LibraryServiceImpl implements LibraryService {

	LibraryDAO libraryDAO = new LibraryDAOImpl();

	public void validateAndInsert(LibraryDTO libraryDTO) {

		try {

			if (libraryDTO != null) {

				if (libraryDTO.getBookID().length() < 3 || libraryDTO.getBookID().length() > 10) {
					throw new IDException();
				}

				if (libraryDTO.getBookName().length() <= 3 || libraryDTO.getBookName().length() > 44) {
					throw new NameException();
				}

				if (libraryDTO.getBookPages() < 20 || libraryDTO.getBookPages() > 5000) {
					throw new PageException();
				}

				if (libraryDTO.getBookPrice() < 100 || libraryDTO.getBookPrice() > 5000) {
					throw new PriceException();
				}

				else {
					System.out.println("Book ID : " + libraryDTO.getBookID() + "\nBook Name : "
							+ libraryDTO.getBookName() + "\nNo. of Pages : " + libraryDTO.getBookPages()
							+ "\nBook Price : " + libraryDTO.getBookPrice());
					libraryDAO.insertBook(libraryDTO);
				}
			}

			else {
				System.out.println("Object Passed is Null");
			}

		} catch (NullPointerException | IDException | NameException | PageException | PriceException e) {
			System.out.println(e.toString());
			System.out.println("Book not added to Library");
			return;
		}

	}

	public List<LibraryDTO> validateAndDisplay() {

		return libraryDAO.displayBooks();

	}

	public void validateAndUpdateByID(LibraryDTO libraryDTO) {

		try {

			if (libraryDTO != null) {

				if (libraryDTO.getBookID().length() <= 3 || libraryDTO.getBookID().length() > 10) {
					throw new IDException();
				}

				if (libraryDTO.getBookName().length() <= 3 || libraryDTO.getBookName().length() > 44) {
					throw new NameException();
				}

				if (libraryDTO.getBookPages() < 20 || libraryDTO.getBookPages() > 5000) {
					throw new PageException();
				}

				if (libraryDTO.getBookPrice() < 100 || libraryDTO.getBookPrice() > 5000) {
					throw new PriceException();
				}

				else {
					System.out.println("Book ID : " + libraryDTO.getBookID() + "\nBook Name : "
							+ libraryDTO.getBookName() + "\nNo. of Pages : " + libraryDTO.getBookPages()
							+ "\nBook Price : " + libraryDTO.getBookPrice());
					libraryDAO.updateBookByID(libraryDTO);
				}
			}

			else {
				System.out.println("Object Passed is Null");
			}

		} catch (NullPointerException | IDException | NameException | PageException | PriceException e) {
			System.out.println(e.toString());
			System.out.println("Book not updated in Library");
			return;
		}

	}

	public void validateAndUpdateByName(String bookName, int bookPages, double bookPrice) {
		
		try {
			
			if(bookName.length() <= 3 || bookName.length() > 44) {
				throw new NameException();
			}
			
			if(bookPages < 20 || bookPages > 5000) {
				throw new PageException();
			}
			
			if(bookPrice < 100 || bookPrice > 5000) {
				throw new PriceException();
			}
			
			else {
				libraryDAO.updateBookByName(bookName, bookPages, bookPrice);
			}
			
		}
		
		catch(NullPointerException | NameException | PageException | PriceException e) {
			System.out.println(e.toString());
			System.out.println("Book not updated in Library");
			return;
		}
		
	}
	
	public void validateAndDeleteByID(String bookID) {
		
		try {
			
			if(bookID.length()<=3 || bookID.length()>10) {
				throw new IDException();
			}
			else {
				libraryDAO.deleteBookByID(bookID);
			}
			
		}
		catch (IDException e) {
			System.out.println(e.toString());
			System.out.println("Book not deleted from Library");
			return;
		}
		
	}
	
	public void validateAndDeleteByName(String bookName) {
		
		try {
			if(bookName.length() <= 3 || bookName.length() > 44 ) {
				throw new NameException();
			}
			else {
				libraryDAO.deleteBookByName(bookName);
			}
		}
		
		catch(NameException e) {
			System.out.println(e.toString());
			System.out.println("Book not deleted from Library");
			return;
		}
	}

}
