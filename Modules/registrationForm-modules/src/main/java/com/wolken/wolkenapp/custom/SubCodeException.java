package com.wolken.wolkenapp.custom;

public class SubCodeException extends Exception{

	@Override
	public String toString() {
		return "Invalid entry - Subject Code must be atleast 5 characters long";
	}
}
