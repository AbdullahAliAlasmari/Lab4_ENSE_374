package product;

public class OrderLine {

	private int N_Quantity; 
	private double The_price; 
	
	OrderLine( ) {
		N_Quantity = 0;
		The_price = 0;
	}
	
	public Product get_Product() { 
		Product temp = null;
		return temp;
	}
	
	public int getQuantiy() {
		return N_Quantity;
	}
	
	public double geThe_price() {
		return The_price;
	}
	public void setQuantiy(int Number_of_Quantity) {
		N_Quantity = Number_of_Quantity;
	}
	
	public void seThe_price(double wantedPrice) {
		The_price = wantedPrice;
	}
}