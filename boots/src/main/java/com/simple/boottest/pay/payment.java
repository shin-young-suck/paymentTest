package com.simple.boottest.pay;

public class payment {
		
	private String name;
    private String cardNumber;
    private String expiry;
    private String cvv;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	
	
	@Override
	public String toString() {
		return "payment [name=" + name + ", cardNumber=" + cardNumber + ", expiry=" + expiry + ", cvv=" + cvv + "]";
	}
    
    
}
