package com.wolken.wolkenapp.custom;

public class PriceException extends Exception {
	
	@Override
	public String toString() {
		return ("Invalid entry - Mobile phone is too expensive !!");
	}
}
