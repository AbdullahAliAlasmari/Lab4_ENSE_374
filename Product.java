package product;

public class Product {

	private String Name_x;
	private double Price_y;
	private int Product_ID_z;
	
	Product() {
		Name_x = null;
		Price_y = 0.0;
		Product_ID_z = 0;
	}
	public Product(String new_Name_x, double new_Price_y, int new_Product_ID_z) {
		Name_x = new_Name_x;
		Price_y = new_Price_y;
		Product_ID_z = new_Product_ID_z;
	}
	
	// setter functions for Name_x, Price_yand Product_ID_z
	public void set_Name_x(String new_Name_x) {
		Name_x = new_Name_x;
	}
	public void set_Price_y(double new_Price_y) {
		Price_y = new_Price_y;
	}
	public void set_Product_ID_z(int new_Product_ID_z) {
		Product_ID_z = new_Product_ID_z;
	}
	
	// getter functions for Name_x, Price_yand Product_ID_z
	public String getName_x() {
		return Name_x;
	}
	public double geThe_Price_y() {
		return Price_y;
	}
	public int getProduct_ID_z() {
		return Product_ID_z;
	}
	
}
