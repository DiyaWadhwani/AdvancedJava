package com.wolken.wolkenapp.custom;

public class SerialNumException extends Exception {
	
	public String toString() {
		return "Invalid entry - Serial Number must be atleast 5 characters long";
	}

}
