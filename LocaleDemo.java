import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {

	public static void main(String[] args) {
		//Locale hindi = new Locale("hi");
		
		//ResourceBundle msgs = ResourceBundle.getBundle("msgs");
		ResourceBundle msgs = ResourceBundle.getBundle("msgs",Locale.FRENCH);
		
		//Locale desi=new Locale("hi");
		//ResourceBundle msgs=ResourceBundle.getBundle("msgs",desi);
		System.out.println(msgs.getString("greeting"));
		System.out.println(msgs.getString("message"));
	}
}
