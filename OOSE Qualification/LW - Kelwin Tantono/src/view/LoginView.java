package view;

import java.util.Scanner;

import controller.CustomerController;
import controller.HandleOrderController;
import controller.OrderController;
import controller.RegisterAddressController;
import controller.ViewAllCourierStatusController;
import controller.ViewCourierStatusController;
import model.Courier;
import repository.ToboyDatabase;

public class LoginView {

	public LoginView() {
		String email = "";
		String pass = "";
		
		Scanner scan = new Scanner(System.in);
		
		// Methods Customer 
		ViewCourierStatusController viewCourier;
		OrderController order;
		RegisterAddressController registerAddress;
		
		int option = 0;
		
		if(ToboyDatabase.customers.size()==0){
			System.out.println("There are no registered Users");
		}else{
			do{
				System.out.println("Enter Your Email: ");
				email = scan.nextLine();
				
				System.out.println("Enter Your Password: ");
				pass = scan.nextLine();
				
			}while(CustomerController.login(email, pass)==0);
			
			do{
				System.out.println("Welcome "+ CustomerController.getName(email, pass));
				System.out.println("1. Register Address and Order Round Tofu");
				System.out.println("2. View Courier Status");
				System.out.println("3. Exit");
				System.out.println("Choose:");
				option = scan.nextInt(); scan.nextLine();
				switch(option){
				case 1:
					registerAddress = new RegisterAddressController(CustomerController.getIndex(email, pass));
					order = new OrderController(CustomerController.getIndex(email, pass));
					break;
						
				case 2:
					viewCourier = new ViewCourierStatusController(CustomerController.getIndex(email, pass));
					break;
				
				}
			}while(option!=3);
		}
	}
}