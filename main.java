package test;
import product.*;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;
public class main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in); 
		
		OrderApplication app = new OrderApplication();
		
		Order wantedOrder = new Order(); 
		int objects_Increment = 0; 
		
		Pattern p = Pattern.compile(","); 
		
		try { 
			
			Scanner fileIn = new Scanner(Paths.get("tempOrder.csv")); 
			
			fileIn.nextLine(); 
			
			while (fileIn.hasNextLine()) { 
				String line = fileIn.nextLine(); 
				
				String[] items = p.split(line); 
				
				

				int productID = Integer.parseInt(items[0]); 
				int quantity = Integer.parseInt(items[1]); 
				
				
				wantedOrder.items()[objects_Increment].set_Product_ID_z(productID);
				wantedOrder.quantity()[objects_Increment].setQuantiy(quantity);
				
				objects_Increment++; 
				
				
			}
			
			
			fileIn.close(); // close the file
			
		} // end of try
		catch (IOException e) { // catch the error
			e.printStackTrace();
		} // end of catch
		
		
		app.createOrder(wantedOrder);
		
		
	}
	
}


///////////////////////////////////

