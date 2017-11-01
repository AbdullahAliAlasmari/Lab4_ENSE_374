package product;

public class PersonalCustomer   extends Customer{

	private int creditCardNumber;
	public PersonalCustomer() {
		creditCardNumber = 0;
	}
	// setter function for creditCardNumber
	public void set_creditCardNumber(int new_creditCardNumber) {
		creditCardNumber = new_creditCardNumber;
	}
	
	// getter function for creditCardNumber
	public int get_creditCardNumber() {
		return creditCardNumber;
	}
}
