package others.basic.things;

public class AnonymousAbstractClass {

	public static void main(String[] args) {

			Cow Cowobj=new Cow() {
				void eatable() {
					System.out.println("Cow from mainclass is eatableing");
				}
				protected void drinkable() {
					System.out.println("Cow from mainclass  is drinkableing");
				}
				static void playable() {
					System.out.println("Cow from mainclass  is playableing");
				}
				void giveable(String what) {
					System.out.println("Cow from mainclass is giveableing"+what);
				}
				
			};
			Cowobj.eatable();
			Cowobj.drinkable();
			Cowobj.giveable("Java");
//			playable();
			



		// TODO Auto-generated method stub

	}

}
abstract class Cow{
	
	abstract void eatable() ;
	protected abstract void drinkable();
//	abstrac static void playable() ;should be either abstarct or static?
	abstract void giveable(String what) ;
		
	
}
