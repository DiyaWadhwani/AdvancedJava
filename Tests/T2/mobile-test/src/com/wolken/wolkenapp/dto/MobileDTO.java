package com.wolken.wolkenapp.dto;

public class MobileDTO {
	
	private int mobID;
	private String mobModel;
	private double mobPrice;
	private int mobMemory;
	private String mobBrand;
	private long mobSerialNum;
	private int mobNoOfCams;
	public int getMobID() {
		return mobID;
	}
	public void setMobID(int mobID) {
		this.mobID = mobID;
	}
	public String getMobModel() {
		return mobModel;
	}
	public void setMobModel(String mobModel) {
		this.mobModel = mobModel;
	}
	public double getMobPrice() {
		return mobPrice;
	}
	public void setMobPrice(double mobPrice) {
		this.mobPrice = mobPrice;
	}
	public int getMobMemory() {
		return mobMemory;
	}
	public void setMobMemory(int mobMemory) {
		this.mobMemory = mobMemory;
	}
	public String getMobBrand() {
		return mobBrand;
	}
	public void setMobBrand(String mobBrand) {
		this.mobBrand = mobBrand;
	}
	public long getMobSerialNum() {
		return mobSerialNum;
	}
	public void setMobSerialNum(long mobSerialNum) {
		this.mobSerialNum = mobSerialNum;
	}
	public int getMobNoOfCams() {
		return mobNoOfCams;
	}
	public void setMobNoOfCams(int mobNoOfCams) {
		this.mobNoOfCams = mobNoOfCams;
	}
	
	
	@Override	
	public String toString() {
		return "\nBrand : "+mobBrand+"\nID : "+mobID+"\nModel : "+mobModel+"\nPrice : "+mobPrice+"\nSerial Number : "+mobSerialNum+"\nMemory : "+mobMemory+"\nNo. Of Cameras : "+mobNoOfCams;
	}
	
}
