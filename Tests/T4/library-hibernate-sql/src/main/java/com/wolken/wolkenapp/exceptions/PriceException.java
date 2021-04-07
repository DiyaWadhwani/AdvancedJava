package com.wolken.wolkenapp.exceptions;

public class PriceException extends Exception {
	
	@Override
	public String toString() {
		
		return "Invalid entry - Price must be between Rs.100-Rs.5000 to be added into the library";
	}

}
