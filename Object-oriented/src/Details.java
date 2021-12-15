public class Details {
	private int empNo;
	private String empName;
	private double salary;
	
 public Details() {
	 empNo=002;
	 empName="Charan";
	 salary=40000; 
 } 
 
  public Details(int empNo,String empName,double salary)
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
 public static void main(String[] args) {
 
	    Details e1=new Details();
	    Details e2=new Details(101,"Charanya",50000);
	    e1.payslip();
	    e2.payslip();
	   
	   
	  }
	}