
class EventImpl implements Event {
	@Override
     public void doSomething() {
	  System.out.println("Class level implementation");
     }
}

public class EventDemo{
	
	class InnerEventImpl implements Event
	{
		@Override
		public void doSomething() {
			System.out.println("Inner class implementation");
			}
	}
	    public static class StaticInnerEventImpl implements Event
	{
		@Override
		public void doSomething() {
			System.out.println("Static inner class implementation");	
		    }
	}
	    public void nestedEvent() 
	{
	    	class NestedEventImpl implements Event
	     {
				@Override
				public void doSomething() {
					System.out.println("Nested event implementation");
					}
	      }
	    	new NestedEventImpl().doSomething();
	 }
	    
	   public void oneMoreEvent() {
		   Event e=new Event() {
			  @Override
			  public void doSomething() {
				  System.out.println("Annonymous event implementation");
			  }
		   };
		   e.doSomething();
	   }
	   public void oneLastEvent() {
		   Event e=()->System.out.println("Lambda event implementation");
	       e.doSomething();
	   }
	public static void main (String[]args) {
	
	EventImpl e1=new EventImpl();
	e1.doSomething();
	
	EventDemo ed= new EventDemo();
	
	EventDemo.InnerEventImpl e2=ed.new InnerEventImpl();
	e2.doSomething();
	
	EventDemo.StaticInnerEventImpl e3=new EventDemo.StaticInnerEventImpl();
	e3.doSomething();
	
	ed.nestedEvent();
	ed.oneMoreEvent();
	ed.oneLastEvent();
}
}
