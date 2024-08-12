package constructor.all.topics;

public class DeepCopyExample {
	 private String names;
	    private String addresses; // Reference to mutable object

	    public DeepCopyExample(String names, String addresss) {
	        this.names = names;
	        this.addresses = addresses;
	    }

	    // Shallow copy constructor is same as copy constructor
	    public DeepCopyExample(DeepCopyExample other) {
	        this.names = other.names;
	        this.addresses = other.addresses; // Copying the reference (shallow copy)
	    }
	    public void display() {
			System.out.println("my name" + names + " with in" + addresses + " my adress");
		}
}
