package inheritance.types.ways;
 class C1 { 
	    int x = 50;
	     void method1() {
		   System.out.println("parent");
	   }
	}
	 class C2 extends C1 {
//	    int x = 40;
//	    static void method1() {
//		   System.out.println("child");
//	   }
	}
	public class Check {
	public static void main(String[] args) 
	{
	   C2 c2 = new C2();
	   System.out.println(c2.x); 
	 
	   C1 c1 = new C1();
	   System.out.println(c1.x);
	   c1.method1();
	 
	   C1 c3 = new C2();
	   System.out.println(c3.x);
	   c3.method1();
	  }
	}
