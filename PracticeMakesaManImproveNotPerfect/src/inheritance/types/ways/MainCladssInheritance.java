package inheritance.types.ways;

public class MainCladssInheritance {
	public void vechicles() {
		System.out.println("we can drive fast");
		
	}
	public void animals() {
		System.out.println("i am scared to animals");
	}
	
	public void commons() {
		System.out.println("it is common we can ovveride in child");
	}
	
	public static void commonsstatic() {
		System.out.println("it is commons static method from parent");
	}
	
   public static void main(String[] args) {
	//single inheritance
	   
	   MainCladssInheritance parentobj=new MainCladssInheritance();
	   
	   //basicall we cantvget the child property to parent property but
	   parentobj.vechicles();
	   parentobj.animals();
	   
//	   we can get the parent property to child property
	   SingleInheritanceExample childobj=new SingleInheritanceExample();
	   childobj.animals();
	   childobj.Buffalo();
	   childobj.Bus();
	   childobj.vechicles();
	   
	   childobj.commons();
	   
	   //if we do upcast fro parent obj
	   MainCladssInheritance refernce=childobj; 
	   refernce.commons();//as we are passingv the child reference and it is non static child is visible
	   refernce.commonsstatic();//not recommended
	   
	   MainCladssInheritance upcastobj=new SingleInheritanceExample(); 
	   upcastobj.commons();//as it is non static method child is visible
	   
//	   SingleInheritanceExample childobj1=parentobj;//not possible
	   
	   upcastobj.commonsstatic();//parnet is comming as it is static
	   
	   System.out.println("--------------------------------------------------------------------");
	   //multilevel inheritance
	   ChildClassExample subchild=new ChildClassExample();
	   subchild.animals();
	   subchild.Buffalo();
	   subchild.husband();
	   
	   subchild.vechicles();
	   subchild.cars();
	   subchild.Bus();
	   
	   MainCladssInheritance subclassupcastobj=new ChildClassExample();
	   subclassupcastobj.animals();
	   subclassupcastobj.commons();//child visible
	   subclassupcastobj.commonsstatic();//parnet visible
	   
	   SingleInheritanceExample subclassupcastobj1=new ChildClassExample();
	   subclassupcastobj1.commons();//child visible
	   subclassupcastobj1.commonsstatic();//parnet visible
		   
	   
	   
	   
}
}
