import com.ibm.bank.Current;

public class TestAccount {

	public static void main(String[]args) {
		Current c1=new Current("Polo");
		c1.summary();
		
		c1.withdraw(3000);
		c1.withdraw(5000);
		c1.summary();
		
		c1.deposit(2000);
		c1.deposit(4000);
		c1.summary();
	}
}
