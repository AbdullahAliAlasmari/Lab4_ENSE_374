package product;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Pattern;
public class OrderApplication  {

	private Customer newCustomer = new Customer();
	private ProductCatalogue Catalogue_1 = new ProductCatalogue();
	private Corporate_Customer First = new Corporate_Customer();
	private PersonalCustomer second = new PersonalCustomer();
	// methods 
	public boolean createOrder(Order cart) {
		Scanner cin = new Scanner(System.in); 
		boolean check = false;
		char Disit_Question_1;
		check = importCatalogue();
		double disit = 0;
		double totalPrice = 0.0;
		if (check == true) {
			totalPrice = cart.calculatePrice(Catalogue_1);
			System.out.println("If you have disit, please press 'Y', otherwise press 'N'.");
			Disit_Question_1 = cin.next().charAt(0);
			if (Disit_Question_1 == 'y') {
				System.out.println("How much disit do you have in % :");
				disit = cin.nextDouble();
				disit = (disit / 100) * totalPrice;
			} 
			String name;
			String address;
			String Customer_Name;
			int creditNumber;
			cin.nextLine();
			System.out.println("please enter your name: ");
			name = cin.nextLine();
			newCustomer.set_Name(name);
			System.out.println("please enter address: ");
			address = cin.nextLine();
			newCustomer.set_Address(address);
			System.out.println("please enter Credit Card number: ");
			creditNumber = cin.nextInt();
			second.set_creditCardNumber(creditNumber);
			cin.nextLine();
			System.out.println("please enter contact name: ");
			Customer_Name = cin.nextLine();
			First.set_Customer_Name(Customer_Name);
			
			System.out.println("Customer information:" );
			
			System.out.println("Customer name:" + newCustomer.getName());
			System.out.println("Customer contact name:" + First.get_Customer_Name());
			System.out.println("Customer Address:" + newCustomer.getAddress());
			System.out.println("Customer total price: $" + totalPrice);
			if(disit > 0) {
				System.out.println("Customer total price after disit is $" + (totalPrice - disit));
			}
		} else {
			System.out.println("Error!");
		}
		
		return check;
	}
	
	private boolean importCatalogue() {
		


		boolean check = false;
		int objects_Increment = 0; 
		
		Pattern p = Pattern.compile(","); //divide the line of the excel file
		
		try { 
			
			Scanner fileIn = new Scanner(Paths.get("products.csv")); 
			
			fileIn.nextLine(); // ignor the headers
			
			
			// loop 
			while (fileIn.hasNextLine()) { 
				String line = fileIn.nextLine(); // read line
				
				String[] items = p.split(line); 
				
				
				// values to be asigned 
				String productName = items[0]; 
				double producThe_price = Double.parseDouble(items[1]); 
				int productID = Integer.parseInt(items[2]); 
				
				
				// set the variables in the object
				Catalogue_1.getProducts()[objects_Increment] = new Product(productName, producThe_price, productID);
				

				
				objects_Increment++; // objects_Increment objects_Increment 
				
				
			}
			
			
			fileIn.close(); // close the file
			
		} // end of try
		catch (IOException e) { // catch the error
			e.printStackTrace();
		} // end of catch
		
		if (objects_Increment == 10) { // check if all items are imported
			check = true;
		}
		return check;
	}
	
	
}

