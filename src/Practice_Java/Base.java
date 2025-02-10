package Practice_Java;

public class Base {
	
		  protected Base() 
		  {
		    System.out.println("Base ctor called");
		  }
		  protected void Method1() 
		  {
		    System.out.println("Method1() called");
		  }
		}

		class Derived extends Base {
		  public Derived() {
		    System.out.println("Derived ctor called");
		  }
		  public void Method2() {
		    System.out.println("Method2() called");
		  }
		}

		


