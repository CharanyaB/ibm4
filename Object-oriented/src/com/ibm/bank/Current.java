
package com.ibm.bank;
/**
 * Current amount
 * @author 002UOK744
 *
 */
public class Current extends Accounts {

	private double overdraft;

	public Current() {
	}

	public Current(String holder) {
		super(holder, 5000);
		this.overdraft=10000;
	}

	@Override
	public void summary() {
		super.summary();
		System.out.println("Overdraft:"+overdraft);
	}

	@Override
	public void deposit(double amount) {
		overdraft+=amount;
		if(overdraft>10000) {
			balance+=overdraft-10000;
			overdraft=10000;
		}
	}

	@Override
	public void withdraw(double amount) {
		if(amount<=(balance+overdraft))
		{
			balance-=amount;
			if(balance<0)
			{
				overdraft+=balance;
				balance=0;
			}else
				System.out.println("Insufficient balance!");
		}
	}

}
