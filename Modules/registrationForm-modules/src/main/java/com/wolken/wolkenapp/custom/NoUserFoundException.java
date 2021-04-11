package com.wolken.wolkenapp.custom;

public class NoUserFoundException extends Exception {

	@Override
	public String toString() {
		return "User not yet registered - login failed. Please register and try again";
	}
}
