package com.usecase.Fees.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Fees {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@Id
	private String studenEmail;

	public String getStudenEmail() {
		return studenEmail;
	}

	public void setStudenEmail(String studenEmail) {
		this.studenEmail = studenEmail;
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

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
