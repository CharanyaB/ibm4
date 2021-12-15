import com.ibm.lib.Book;
import com.ibm.lib.Member;

public class TestLibrary {
	
	public static void main(String[]args) {
		Book b1=new Book("The Alchemist");
		Member m1=new Member("Polo");
		 b1.status();
		 m1.status();
		 
		 b1.issueBook(m1);
		 
		 b1.status();
		 m1.status();
		 
		 b1.issueBook(m1);
		 b1.returnBook(m1);
		 
		 b1.status();
		 m1.status();
	}

}
