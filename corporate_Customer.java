package product;

public class Corporate_Customer  extends Customer {

	private String Customer_Name;
	public Corporate_Customer() {
		Customer_Name = null;
	}
	// setter function for Customer_Name
	public void set_Customer_Name(String new_Customer_Name) {
		Customer_Name = new_Customer_Name;
	}
	
	// getter
	public String get_Customer_Name() {
		return Customer_Name;
	}
}