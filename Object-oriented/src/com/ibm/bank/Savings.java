package com.ibm.bank;
/**
 * Savings
 * @author 002UOK744
 *
 */

public class Savings extends Accounts {

	public Savings() {
		
	}

	public Savings(String holder) {
		super(holder, 1000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=(balance-1000))
			balance-=amount;
		else
			System.out.println("Insufficient balance");
	}

}
