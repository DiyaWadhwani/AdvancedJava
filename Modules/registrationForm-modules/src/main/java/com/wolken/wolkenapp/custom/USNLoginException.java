package com.wolken.wolkenapp.custom;

public class USNLoginException extends Exception {
	
	@Override
	public String toString() {
		return "Invalid USN provided - login failed";
	}
}
