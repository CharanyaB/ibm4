package com.ibm.bank;
/**
 * 
 * account Details
 * @author 002UOK744
 *
 */
public class Accounts {
  private int acntNo;
  private String holder;
  protected double balance;
  
  private static int counter;
  
  //Execute at the time of class loding..
  static { //Static initialiser block, conside as constructor for static memebers
	  //System.out.println("Accounts class loaded...");
	  counter=1001;
  }
  
  public double getBalance() {
	return balance;
}
  /**
   * return balance
   * @param balance
   */

public void setBalance(double balance) {
	this.balance = balance;
}
/**
 * points the balance
 */

public Accounts() {
  }
/**Account default
 * holder for this
 * @param holder
 * @param balance
 */
  
  public Accounts(String holder,double balance) {
	  this.acntNo=counter ++;
	  this.holder=holder;
	  this.balance=balance;
  }
  /**
   * Hold the value
   */
  
  public void summary()
  {
	  System.out.println("A/C No:"+acntNo);
	  System.out.println("Holder:"+holder);
	  System.out.println("Balance:"+balance);
  }
  /**
   * Just a summary
   * @param amount
   */
  //BL(Business Logic)Methods
  public void deposit(double amount) {
	  balance+=amount;
  }
  /**
   * Returns amount
   * @param amount
   */
  
  public void withdraw(double amount) {
	  if(amount<=balance)
		  balance-=amount;
	  else
		  System.out.println("Insufficient balance!");
  }
  /**
   * withdrawing the amount
   */
}
