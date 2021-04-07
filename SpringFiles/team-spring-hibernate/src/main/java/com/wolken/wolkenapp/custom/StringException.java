package com.wolken.wolkenapp.custom;

public class StringException extends Exception {
	
	@Override
	public String toString() {
		
		return "Invalid entry - More than 1 character expected to be registered";
	}

}
