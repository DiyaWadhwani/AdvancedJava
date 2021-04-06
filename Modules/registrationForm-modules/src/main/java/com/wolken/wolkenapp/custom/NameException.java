package com.wolken.wolkenapp.custom;

public class NameException extends Exception {

	@Override
	public String toString() {
		return "Invalid entry - Name must be atleast 3 characters long";
	}
}
