package com.iibm.stock;
/**
 * contains all details
 * @author 002UOK744
 *
 */
public class Stock implements Exchange {
	
	@Override
	public void getQuote() {
		System.out.println("Get quote");
		
	}
    @Override
	public void viewQuote() {
		System.out.println("view quote");
		
	}

	@Override
	public void setQuote() {
		System.out.println("set quote");
		
	}
	
}
