package com.wolken.wolkenapp.exceptions;

//CompileTimeException - Checked
public class IDException extends Exception {
	
	@Override
	public String toString () {
		return "Invalid ID - Please enter an ID with 3-10 characters";
	}

}
