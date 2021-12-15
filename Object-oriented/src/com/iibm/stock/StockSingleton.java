package com.iibm.stock;
/**
 * single storage concept
 * @author 002UOK744
 *
 */
public class StockSingleton {
 
	private StockSingleton() {
		
	}
	
	private static Stock stk;
	public static Stock getStock()
	{
		if(stk==null) 
			stk=new Stock();
		return stk;
	}
}
