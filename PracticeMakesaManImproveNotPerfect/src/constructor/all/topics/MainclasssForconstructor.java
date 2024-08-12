package constructor.all.topics;

public class MainclasssForconstructor {
	private int values;
	private String names;
	private int ages;
	public MainclasssForconstructor(//default non static and public,protected ,and default //cangt be private doesnot make sense
			 int values,
			 String names,
			 int ages){
		this.values=values;
		this.names=names;
		this.ages=ages;
		System.out.println("it is parametered consyryctror");

		
	}
	//if we keep any one cpnstructor as private we cant extend this constructor by another chuild constructor
	//compiler error:
//	Implicit super constructor MainclasssForconstructor() is not visible. Must explicitly invoke another constructor
	 MainclasssForconstructor(){
		System.out.println("it is zero parameter consyryctror");
	}
	void display() {
		System.out.println(names+ages+values);
		System.out.println("i am from parent method");
	}
	static void checkmethod() {
		System.out.println("checkung teh static method inside consttuctor in parent class");
	}
	

	public static void main(String[] args) {
		
		MainclasssForconstructor obj1=new MainclasssForconstructor(56,"jamal",23);
		obj1.display();
		ConstructorOverloadingExample obj2=new ConstructorOverloadingExample(5,"jamu",28);
		obj2.display();
		ConstructorOverloadingExample obj3=new ConstructorOverloadingExample("jamu",28);
		obj3.display();
		ConstructorOverloadingExample obj4=new ConstructorOverloadingExample(5);
		obj4.display();
		CopyConstrutorExample actuallobj=new CopyConstrutorExample("software dev",2);
		CopyConstrutorExample copyobj=actuallobj;
		copyobj.display();
		
		ShallowCopyExample actualobj1=new ShallowCopyExample("names","adress");
		actualobj1.display();
	//thisos is deep copy not shallow copy
		ShallowCopyExample actualobj2=new ShallowCopyExample(actualobj1);
		actualobj2.display();
		//other way
		ShallowCopyExample actualobj3=actualobj2;
		actualobj3.display();
		
		System.out.println(actualobj1==actualobj2);
		System.out.println(actualobj1==actualobj3);
		System.out.println(actualobj2==actualobj3);
		
		DeepCopyExample originalobj=new DeepCopyExample("namess","jansnbbh");
		DeepCopyExample deepcopyobjs1=new DeepCopyExample("odiywutduzwg","uiehyfihyihfh");

		DeepCopyExample deepcopyobjs2=new DeepCopyExample(originalobj);
		
		//accesing overided method in comstructor
		//non static method
		MainclasssForconstructor mainobj=new MainclasssForconstructor();
		mainobj.display();//parent methid is viisble
	
		ConstructorOverloadingExample chilobj=new ConstructorOverloadingExample("jam",5);
		chilobj.display();//child obj so child is visible
		
		MainclasssForconstructor upcastobj= new ConstructorOverloadingExample("jamy",6);
		upcastobj.display();//child is visible
		upcastobj.checkmethod();//parent onlyb visible asit is static
		
		//constructor chaining in class level using this
		ConstructorChainingExample constchainobj=new ConstructorChainingExample();
		//constructor chaining in superclass level using super
		System.out.println("---------------------------------------------------");
		SuperConstructorChaining superconstobj=new SuperConstructorChaining();
//		constchainobj.SuperConstructorChaining();//mnot possible
		
		//the above call will will not start from single param it start the constructor from firts only
		
		
		
		

		
		
				
	}

}
