package com.wolken.wolkenapp.custom;

public class BacklogException extends Exception {

	@Override
	public String toString() {
		return "Invalid entry - Backlogs must be between 0 and 5";
	}
}
