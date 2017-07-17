package com.ba.beans;

public class Address {
	private String fullAddress;

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Address [fullAddress=" + fullAddress + "]";
	}
	
	
}
