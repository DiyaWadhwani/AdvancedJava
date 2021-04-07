package com.wolken.wolkenapp.custom;

public class BulletException extends Exception {
	
	public String toString() {
		return "Gun has less than 6 bullets - it cannot be sold !";
	}

}
