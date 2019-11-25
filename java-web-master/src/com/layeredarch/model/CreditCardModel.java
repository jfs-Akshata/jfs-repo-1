package com.layeredarch.model;

public class CreditCardModel {
	private String cardNo;
	public CreditCardModel(String cardNo, String cardHolderName) {
		super();
		this.cardNo = cardNo;
		this.cardHolderName = cardHolderName;
	}
	private String cardHolderName;
	public String getCardHolderName() {
		return cardHolderName;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	@Override
	public String toString() {
		return "CreditCardModel [cardNo=" + cardNo + ", cardHolderName=" + cardHolderName + "]";
	}
}
