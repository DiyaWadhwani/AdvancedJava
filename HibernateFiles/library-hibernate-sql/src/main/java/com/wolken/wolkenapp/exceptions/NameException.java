package com.wolken.wolkenapp.exceptions;

public class NameException extends Exception {
	
	@Override
	public String toString() {
		
		return "Invalid entry - Please enter a Name with 3-45 characters";
	}

}
