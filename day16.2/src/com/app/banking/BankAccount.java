package com.app.banking;

import static utils.BankValidationRules.validateBalance;
//acctNo(int) , type(enum), balance, creationDate(LocalDate), customerName

import java.time.LocalDate;

import custom_exceptions.AccountOverdrawnException;

public class BankAccount {

	private int acctNo;
	private AcType type;
	private double balance;
	private LocalDate createionDate;
	private String customerName;
	
		public BankAccount(int acctNo, AcType type, double balance, LocalDate createionDate, String customerName) {
		super();
		this.acctNo = acctNo;
		this.type = type;
		this.balance = balance;
		this.createionDate = createionDate;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", type=" + type + ", balance=" + balance + ", createionDate="
				+ createionDate + ", customerName=" + customerName + "]";
	}
	//B.L deposite
	public void deposite(double amount)
	{
		balance += amount;
	}
	//B.L withdraw
	public void withdraw(double amount) throws AccountOverdrawnException
	{
		validateBalance(balance-amount);
		balance -=amount;
	}
	//B.L transfer funds
	public void transferFunds(BankAccount dest, double transferAmount) throws AccountOverdrawnException
	{
		//witdraw from src a/c
		this.withdraw(transferAmount);
		dest.deposite(transferAmount); 
	}
	//getter for AcType
	public AcType getType() {
		return type;
	}
	
}
