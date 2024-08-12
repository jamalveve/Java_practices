package abstraction.abstracts.topic;

public abstract class PrivateMethodCheck {
	
	abstract void  methods1();
	public static void methods2() {
		System.out.println("i am static methid from gthe abstract class");
	}
	private void privatemethod() {
		System.out.println("iam private methid frorm abstact class");
	}
	
	public static void main(String[] args) {
		
		methods2();
		OneChildclassforAboveParentClass childclassobjs=new OneChildclassforAboveParentClass();
//		childclassobjs.privatemethod();//not possible
	}

}
class OneChildclassforAboveParentClass extends PrivateMethodCheck{

	@Override
	void methods1() {
		// TODO Auto-generated method stub
		
	}
	
}
