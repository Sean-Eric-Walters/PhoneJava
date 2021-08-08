package com.sean.phone;

public class IPhone extends Phone implements Ringable{
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	public String ring() {
		return String.format("iPhone %s says %s", getVerizionNumber(), getRingTone());
	}

	public String unlock() {
		return "Unlocking via facial recognition";
	}

	public void displayInfo() {
		System.out.println(String.format("iPhone %s from %s", getVerizionNumber(), getCarrier()));
	}
}
