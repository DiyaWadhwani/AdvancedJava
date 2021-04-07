package com.wolken.wolkenapp.exceptions;

public class PageException extends Exception {
	
	@Override
	public String toString() {
		
		return "Invalid entry - Book must have 20-5000 pages to be added into the library";
	}

}
