package com.ba.beans;

public class Customer {
	private Address address;

	
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [address=" + address + "]";
	}
	
	
}
