package com.app.core;

import static java.lang.Thread.currentThread;

public class JointAccount {
	private double balance;

	public JointAccount(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "JointAccount [balance=" + balance + "]";
	}

	// update balance : orig bal = 5000, amount=1000
	public void updateBalance(double amt) throws Exception {
		System.out.println("updating balance : " + currentThread().getName());
		balance = balance + amt;//6000
		System.out.println("Cancelling updates, after a dly");
		Thread.sleep(20);// think time
		balance = balance - amt;//5000
		System.out.println("Updation over by " + currentThread().getName());
	}// bal = 5000	

	// check balance
	public double checkBalance() throws Exception {
		System.out.println("Checking balance by " + currentThread().getName());
	//	Thread.sleep(37);
		return balance;
	}//bal = 5000
}
