package com.wedapp;


public class Payment {

	// payment domain class

	public String userName;
	public String paymentType;
	private long cardNo;
	private Integer cvv;
	public Integer amount;
	public String purpose;
	public String expiryDate;

	@Override
	public String toString() {
		return "Payment [userName=" + userName + ", paymentType=" + paymentType + ", cardNo=" + cardNo + ", cvv=" + cvv
				+ ", amount=" + amount + ", purpose=" + purpose + ", expiryDate=" + expiryDate + "]";
	}

	/*
	 * Encaspulation is done and using set and get methods, retrieved the hiding
	 * data
	 * @return cardNo
	 */
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public long getCardNo() {
		return cardNo;
	}
	/*
	 * Encaspulation is done and using set and get methods, retrieved the hiding
	 * data
	 * @return cvv
	 */
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}

	public Integer getCvv() {
		return cvv;
	}

}
