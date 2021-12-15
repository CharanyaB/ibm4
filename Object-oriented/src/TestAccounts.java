import com.ibm.bank.Accounts;

public class TestAccounts {

	public static void main(String[]args) {
		Accounts a1=new Accounts("Charan",5000);
		a1.summary();
		
		a1.deposit(2000);
		a1.summary();
		
		a1.withdraw(4000);
		a1.summary();
		
		a1.withdraw(5000);
		}
}
