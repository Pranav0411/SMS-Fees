package com.usecase.Fees.payload;

public class DataTransfer {
	
	private int id;
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String amount ;
	
	private String paymentid;
	
	private String feestype;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(String paymentid) {
		this.paymentid = paymentid;
	}

	public String getFeestype() {
		return feestype;
	}

	public void setFeestype(String feestype) {
		this.feestype = feestype;
	}

	
	

}
