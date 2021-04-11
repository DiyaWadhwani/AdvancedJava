package com.wolken.wolkenapp.custom;

public class SubSeatException extends Exception {
	
	@Override
	public String toString() {
		return "Invalid entry - No. of seats cannot be less than 0";
	}

}
