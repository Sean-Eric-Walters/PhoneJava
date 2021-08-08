package com.sean.phone;

public abstract class Phone {
	private String verizonNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	
	
	public Phone(String  verizonNumber, int batteryPercentage, String carrier, String ringTone) {
		this.verizonNumber = verizonNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	
	
	//===abstract method===
	public abstract void displayInfo();
	
	
	//===getters and setters===
	public String getVerizionNumber() {
		return verizonNumber;
	}

	public void setVerzionNumber(String versionNumber) {
		this.verizonNumber = versionNumber;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
}
