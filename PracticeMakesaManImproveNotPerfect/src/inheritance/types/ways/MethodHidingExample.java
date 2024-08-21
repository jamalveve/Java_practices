package inheritance.types.ways;

//class Parent {
//    // Static method in the parent class
//    static void staticMethod() {
//        System.out.println("Static method in Parent class.");
//    }
//    
//    // Instance method in the parent class
//    void instanceMethod() {
//        System.out.println("Instance method in Parent class.");
//    }
//}

class Child extends MethodHidingExample {
    // Static method in the child class hiding the static method in the parent class
    static void staticMethod() {
        System.out.println("Static method in Child class.");
    }
    
    // Instance method in the child class
    void instanceMethod() {
        System.out.println("Instance method in Child class.");
    }
}

public class MethodHidingExample {
	
//	  Static method in the parent class
  static void staticMethod() {
      System.out.println("Static method in Parent class.");
  }
  
  // Instance method in the parent class
  void instanceMethod() {
      System.out.println("Instance method in Parent class.");
  }
    public static void main(String[] args) {
    	
    	
        // Calling static methods
    	MethodHidingExample.staticMethod(); // Outputs: Static method in Parent class.
        Child.staticMethod();  // Outputs: Static method in Child class.

        // Creating instances to call instance methods
        MethodHidingExample parent = new MethodHidingExample();
        MethodHidingExample childAsParent = new Child(); // Upcasting

        parent.instanceMethod();    // Outputs: Instance method in Parent class.
        childAsParent.instanceMethod(); // Outputs: Instance method in Child class.

        // Note: Static methods cannot be called on instance references.
        // So the following lines would be incorrect:
//        when you do upcast-> both will call paranet method only unless it is a nonstatic metod
        // parent.staticMethod();    // This will call Parent's staticMethod
        // childAsParent.staticMethod(); // This will also call Parent's staticMethod
   
    
    
    
    }
}
