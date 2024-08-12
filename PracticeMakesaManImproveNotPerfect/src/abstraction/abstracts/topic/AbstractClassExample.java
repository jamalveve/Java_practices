package abstraction.abstracts.topic;

public abstract class AbstractClassExample {

	// abstatct classes can have abstract method and deafault method
	// if any class contains one abstractmeyhod means also the class should be
	// declard as abstract
	final String names = "maruthi";
	private final String kind;// only in consyructor declaration is possible

	AbstractClassExample(String kind) {
		this.kind = kind;
		System.out.println(kind);

	}

	abstract void engine();

	abstract int tire();

	abstract String Cardetails(String carName, String carmodel);

	public static void method3() {//public /protectred/default methods
		System.out.println("I a, default method in abstract class");

	}

	final void finalmethod4() {
		System.out.println("I am final method in abstract class");
	}// you cant overide

	final void finalparameterisedmethod4(int abc, String adress) {
		System.out.println("I am final method in abstract class giving two parameter" + abc + adress);
	}// y
}

class Carss extends AbstractClassExample {

	Carss(String name, int some) {
		super("kindhearted");// super statemnt in constructor first line

		System.out.println(name + some);
	}

	@Override
	void engine() {
		System.out.println("cars will have a ANC engine");
	}

	@Override
	int tire() {
		return 4;
	}

	@Override
	String Cardetails(String carName, String carmodel) {

		return "CardDetails:CarName is" + carName + "carmodel is" + carmodel;
	}

}
