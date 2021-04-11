package com.wolken.wolkenapp.custom;

public class DOBLoginException extends Exception {

	@Override
	public String toString() {
		return "Invalid DOB provided - login failed";
	}
}
