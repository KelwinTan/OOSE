package view;

import java.util.Scanner;

import controller.CourierController;
import controller.HandleOrderController;
import controller.UpdateCourierStatusController;
import controller.ViewAllCourierStatusController;
import controller.ViewOrderController;

public class CourierLogin {

	public CourierLogin() {
		String email;
		String pass;
		Scanner scan = new Scanner(System.in);
		int option=0;
		do{
			System.out.println("Enter Your Email: ");
			email = scan.nextLine();
			
			System.out.println("Enter Your Password: ");
			pass = scan.nextLine();
			
		}while(CourierController.login(email, pass)==0);
		UpdateCourierStatusController update;
		ViewOrderController view;
		do{
			System.out.println("Welcome " + email);
			System.out.println("1. Update Courier Status");
			System.out.println("2. View Order");
			System.out.println("3. Exit");
			System.out.println("Choose:");
				
			option = scan.nextInt(); scan.nextLine();
			
			switch(option){
			case 1:
				update = new UpdateCourierStatusController(CourierController.getIndex(email, pass));
				break;
					
			case 2:
				view = new ViewOrderController(CourierController.getIndex(email, pass));
				break;
			}
		}while(option!=3);
	}
	
	
}

