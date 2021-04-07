package com.wolken.wolkenapp.custom;

public class PriceException extends Exception {
	
	double price;
	
	public PriceException(double p) {
		price = p;
	}
	
	public String toString() {
		if(price > 500000)
			return "Gun is too expensive cannot be sold";
		else
			return "Gun cannot be sold - Price is too less !";
	}

}
