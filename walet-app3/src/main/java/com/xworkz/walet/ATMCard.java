package com.xworkz.walet;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ATMCard {

	private long cardNo;
	private int cvv;
	private CARDTYPE cardType;
	private String color;
	private java.util.Date expriyDate;

	public ATMCard() {

		System.out.println(this.getClass().getSimpleName() + "Bean created");
	}

	@Override
	public String toString() {
		return "ATMCard [cardNo=" + cardNo + ", cvv=" + cvv + ", cardType=" + cardType + ", color=" + color
				+ ", expriyDate=" + expriyDate + "]";
	}

	public ATMCard(long cardNo, int cvv, CARDTYPE cardType, String color, Date expriyDate) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.cardType = cardType;
		this.color = color;
		this.expriyDate = expriyDate;
	}

	@Value("${atm1}")
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	@Value("${atm2}")
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	@Value("${atm3}")
	public void setCardType(CARDTYPE cardType) {
		this.cardType = cardType;
	}

	@Value("${atm4}")
	public void setColor(String color) {
		this.color = color;
	}

	@Value("${atm5}")
	public void setExpriyDate(java.util.Date expriyDate) {
		this.expriyDate = expriyDate;
	}

}
