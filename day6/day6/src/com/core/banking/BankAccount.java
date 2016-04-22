package com.core.banking;

import java.util.Date;

import cust_excs.AccountHandlingException;
import static utils.AccountValidationUtils.*;

public class BankAccount implements Bank {
	private int id;
	private String name, type;
	private double balance;
	private Date creationDate;
	private static int idCounter;

	public BankAccount(String name, String type, double balance,
			Date creationDate) {
		id = ++idCounter;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.creationDate = creationDate;
	}

	@Override
	public void deposit(double amt) {
		balance += amt;

	}

	// toString
	@Override
	public String toString() {
		return "BankAccount id=" + id + ", name=" + name + ", type=" + type
				+ ", balance=" + balance + ", creationDate="
				+ getSdf().format(creationDate);
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null || !(o instanceof BankAccount))
			return false;
		return id == ((BankAccount)o).id;
	}

	@Override
	public void withdraw(double amt) throws AccountHandlingException {
		validateBalance(balance-amt);
		balance -= amt;
	}

	@Override
	public void transferFunds(BankAccount dest, double amt)
			throws AccountHandlingException {
		withdraw(amt);
		dest.deposit(amt);

	}

}
