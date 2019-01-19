package view;

import java.util.Scanner;

import controller.CustomerController;
import controller.HandleOrderController;
import controller.ViewAllCourierStatusController;
import repository.ToboyDatabase;

public class AdminLogin {

	public AdminLogin() {
		
		// Methods for Admin
		HandleOrderController handleOrder;
		ViewAllCourierStatusController viewAllCourier;
				
				
		int option=0;
		String email = "";
		String pass = "";
		Scanner scan = new Scanner(System.in);
		

		do{
			System.out.println("Enter Your Email: ");
			email = scan.nextLine();
			
			System.out.println("Enter Your Password: ");
			pass = scan.nextLine();
			
		}while(!(email.equals("admin@admin.com") && pass.equals("Admin")));
			
		do{
			System.out.println("Welcome " + email);
			System.out.println("1. Handle Order");
			System.out.println("2. View All Courier Status");
			System.out.println("3. Exit");
			System.out.println("Choose:");
				
			option = scan.nextInt(); scan.nextLine();
			
			switch(option){
			case 1:
				handleOrder = new HandleOrderController();
				break;
					
			case 2:
				viewAllCourier = new ViewAllCourierStatusController();
				break;
			}
		}while(option!=3);
	}
	
}


