package com.wolken.wolkenapp.custom;

public class CameraException extends Exception {

	int cams ;
	
	public CameraException(int c) {
		cams = c;
	}
	
	@Override
	public String toString() {
		return ("Invalid entry - No mobile exists with "+cams+" cameras");
	}
}
