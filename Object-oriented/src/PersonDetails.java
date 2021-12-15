
public class PersonDetails {

	private int empNo;
	private String empName;
	private double salary;
	
 public PersonDetails() {
 }
 public PersonDetails(int empNo,String empName,double salary)
 {   
	 this.empNo=empNo;
	 this.empName=empName;
	 this.salary=salary;
 }
 public void payslip()
 {
	 System.out.println("Empn No:"+empNo);
	 System.out.println("Empn Name:"+empName);
	 System.out.println("salary:"+salary);
	 
 } 
 
 @Override
public String toString() {
	
	return "Empn No:"+empNo+"Empn Name:"+empName+"salary:"+salary;
}
 
@Override
public boolean equals(Object obj) {
	if(obj instanceof PersonDetails)
	{
		PersonDetails p=(PersonDetails)obj;
		if(p.empName.equals(this.empName)&&p.salary==this.salary)
			return true;
	}return false;
}
public static void main(String[] args) {
 
	    
	    PersonDetails e1=new PersonDetails(101,"Charan",3000);
	    e1.payslip();
	    System.out.println(e1.hashCode());
	    System.out.println(e1);
	    
	    PersonDetails e2=new PersonDetails(102,"lili",19);
	    System.out.println(e2.hashCode());
	    System.out.println(e1.equals(e2));
	  }
	}