package product;

public class Customer {
	
	private static String name;
	private static String address;
	private static float creditRating;
	private static float disitRating;
	
	
		// setter functions for CreditRating,Name, address and disitRating
 
	public void set_CreditRating(float new_creditRating) {
		creditRating = new_creditRating;
	}
	public void set_Name(String new_name) {
		name = new_name;
	}
	public void set_Address(String new_address) {
		address = new_address;
	}
	public void set_DisitRating(float new_disitRating) {
		disitRating = new_disitRating;
	}
	
	
	// getters
	public float getCreditRating() {
		return creditRating;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public float getDisitRating() {
		return disitRating;
	}
}