
	
	class Alfa
	{
		public Alfa()
		{
			System.out.println("Alfa Constructor");
		}
		public void demo() 
		{
			System.out.println("Alfa Demo");
		}
	}
	class Beta extends Alfa
	{
		public Beta()
		{
			System.out.println("Beta Constructor");
		}
		public void test() 
		{
			System.out.println("Beta Demo");
		}
		public void demo()
		{
			System.out.println("Beta Demo");
		}
	}
    class Inheritance{
    	public static void main(String args[])
    	{
	Alfa a=new Alfa();
     a.demo();
	Beta b=new Beta();
     b.demo();
     b.test();
     Alfa ab=b;
     ab.demo();
     
     Beta ba=(Beta)ab;
     ba.demo();
     ba.test();
    	}	
}
