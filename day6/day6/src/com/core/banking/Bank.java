package com.core.banking;

import cust_excs.AccountHandlingException;

public interface Bank {
	void deposit(double amt);

	void withdraw(double amt) throws AccountHandlingException;
	void transferFunds(BankAccount dest,double amt) throws AccountHandlingException;

}
