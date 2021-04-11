package com.wolken.wolkenapp.custom;

public class SubNameException extends Exception {
	
	@Override
	public String toString() {
		return "Invalid entry - Subject name must be atleast 2 characters long";
	}

}
