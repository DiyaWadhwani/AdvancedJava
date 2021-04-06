package com.wolken.wolkenapp.custom;

public class GPAException extends Exception {
	
	@Override
	public String toString() {
		return "Invalid entry - GPA must be between 4 and 10";
	}

}
