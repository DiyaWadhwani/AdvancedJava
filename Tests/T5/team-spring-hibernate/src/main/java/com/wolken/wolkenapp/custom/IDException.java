package com.wolken.wolkenapp.custom;

//CompileTimeException - Checked
public class IDException extends Exception {
	
	@Override
	public String toString () {
		return "Invalid ID - Team ID must be an integer greater than 0 to be registered";
	}

}
