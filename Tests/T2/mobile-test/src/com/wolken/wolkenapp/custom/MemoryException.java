package com.wolken.wolkenapp.custom;

public class MemoryException extends Exception {
	
	int mem ;
	
	public MemoryException(int m) {
		mem = m;
	}
	
	@Override
	public String toString() {
		return ("Invalid entry - No mobile exists with Memory "+mem+ " GB");
	}

}
