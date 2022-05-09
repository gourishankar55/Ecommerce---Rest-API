package com.example.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ecommerce")
public class Ecommerce {
	
	@Id
	private int orderId;
	private String productCategory;
	private double amount;
	private String payment;
	private double discount;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public Ecommerce(int orderId, String productCategory, double amount, String payment, double discount) {
		super();
		this.orderId = orderId;
		this.productCategory = productCategory;
		this.amount = amount;
		this.payment = payment;
		this.discount = discount;
	}
	
	public Ecommerce() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Ecommerce [orderId=" + orderId + ", productCategory=" + productCategory + ", amount=" + amount
				+ ", payment=" + payment + ", discount=" + discount + "]";
	}
	
	



}
