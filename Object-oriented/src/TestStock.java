

import com.iibm.stock.Broker;
import com.iibm.stock.Holder;
import com.iibm.stock.StockSingleton;

public class TestStock {
	
	public static void main(String[] args) {
		
		
		Holder h=StockSingleton.getStock();//stock or holder or broker or exchange can be given
		
		h.viewQuote();
 
		Broker b=StockSingleton.getStock();
		b.getQuote();
		System.out.println(h==b);
	}
	}

