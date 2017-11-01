package product;

public class ProductCatalogue {
	
	private static Product[] catalogue = new Product[10]; 
	
	public ProductCatalogue() {
		int i = 0;
		while (i < 10) {
			catalogue[i] = new Product();
			i++;
		}
	}
	public Product[] getProducts() {
		return catalogue;
	}
	public void setProducts(String new_Name_x, double new_Price_y, int new_Product_ID_z, int objects_Increment) {
		catalogue[objects_Increment] = new Product(new_Name_x, new_Price_y, new_Product_ID_z);
	}
}