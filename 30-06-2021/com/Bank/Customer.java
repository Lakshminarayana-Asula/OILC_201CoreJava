package com.Bank;

public class Customer {
	private int CustId;
	private String custName;
	private double balance;
	
	public Customer(int custId, String custName, double balance) {
		CustId = custId;
		this.custName = custName;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [CustId=" + CustId + ", custName=" + custName + ", balance=" + balance + "]";
	}
	
}
