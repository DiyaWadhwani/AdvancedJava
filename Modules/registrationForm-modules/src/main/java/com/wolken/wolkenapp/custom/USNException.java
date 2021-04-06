package com.wolken.wolkenapp.custom;

public class USNException extends Exception {

	@Override
	public String toString() {
		return "Invalid entry - USN must be atleast 10 characters long";
	}
}
