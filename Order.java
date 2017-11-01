package product;

import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Order{

	private Date dateReceived;
	private double price;
	private int orderID;
	
	private Product[] Selected_Items;
	private OrderLine[] Number_of_Quantity;
	public Order() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		dateReceived = new Date();
		dateFormat.format(dateReceived);
		price = 0;
		orderID = 0;
		Selected_Items = new Product[10];
		Number_of_Quantity = new OrderLine[10];
		int objects_Increment = 0;
		while (objects_Increment < 10) {
			Selected_Items[objects_Increment] = new Product();
			objects_Increment++;
		}
		objects_Increment = 0;
		while (objects_Increment < 10) {
			Number_of_Quantity[objects_Increment] = new OrderLine();
			objects_Increment++;
		}
	}
	
	// setter functions for dateReceived, priceand orderID
	public void set_dateReceived(Date new_dateReceived) {
		dateReceived = new_dateReceived;
	}
	
	public void set_price(double new_price) {
		price = new_price;
	}
	
	public void set_orderID(int new_orderID) {
		orderID = new_orderID;
	}
	
	// getter function for dateReceived, priceand orderID
	public Date get_dateReceived() {
		return dateReceived;
	}
	
	public double get_price() {
		return price;
	}
	
	public int get_orderID() {
		return orderID;
	}
	public Product[] items() {
		return Selected_Items;
	}
	public OrderLine[] quantity() {
		return Number_of_Quantity;
	}
	
	// methods required
	public Date getDateReceived() { 
		return dateReceived;
	}
	
	public double calculatePrice(ProductCatalogue Catalogue_1) {
		System.out.println("Here is your order recipt:");
		System.out.println("The Date of order recieved: " + dateReceived);
		
		int objects_IncrementLoop = 0;
		int objects_IncrementItems = 0;
		while (objects_IncrementLoop < 10) {
			price = price + (Number_of_Quantity[objects_IncrementLoop].getQuantiy() * Catalogue_1.getProducts()[objects_IncrementLoop].geThe_Price_y());
			if (Number_of_Quantity[objects_IncrementLoop].getQuantiy() > 0) {
				System.out.println("-----------------------------------------------------------" );
				System.out.println("item " + ++objects_IncrementItems + ":" );
				System.out.println("Name: " + Catalogue_1.getProducts()[objects_IncrementLoop].getName_x());
				System.out.println("Price: " + Catalogue_1.getProducts()[objects_IncrementLoop].geThe_Price_y());
				System.out.println("product ID: " + Catalogue_1.getProducts()[objects_IncrementLoop].getProduct_ID_z());
				System.out.println("Quentity: " + Number_of_Quantity[objects_IncrementLoop].getQuantiy());
				System.out.println("------------------------------------------------------------" );
				
			}
			objects_IncrementLoop++;
		}
		return price;
	}
	
}
