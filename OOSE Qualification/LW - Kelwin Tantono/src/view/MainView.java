package view;

import java.util.Scanner;

import model.Admin;
import model.Courier;
import repository.ToboyDatabase;

public class MainView {
	
	int choose = 0;
	Scanner scan = new Scanner(System.in);
	
	LoginView login;
	RegisterView register;
	AdminLogin adminLogin;
	CourierLogin courierLogin;
	void menu(){
		ToboyDatabase.courier.add(new Courier(0, "AP18-2", "alberts@toboy.com", "alberts18-2", "Not Delivering"));
		ToboyDatabase.courier.add(new Courier(1, "DL18-2", "douglas@toboy.com", "douglas18-2", "Not Delivering"));
		ToboyDatabase.courier.add(new Courier(2, "RY18-2", "ferdyan@toboy.com", "ferdyan18-2", "Not Delivering"));
		
		
		
		do{
			System.out.println(" _________  ________  ________  ________      ___    ___ ");  
			System.out.println("|\\___   ___\\\\   __  \\|\\   __  \\|\\   __  \\    |\\  \\  /  /|"); 
			System.out.println("\\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\|\\ /\\ \\  \\|\\  \\   \\ \\  \\/ / /"); 
			System.out.println("     \\ \\  \\ \\ \\  \\\\\\  \\ \\   __  \\ \\  \\\\\\  \\   \\ \\   / / "); 
			System.out.println("      \\ \\  \\ \\ \\  \\\\\\  \\ \\  \\|\\  \\ \\  \\\\\\  \\   \\/  / /  ");   
			System.out.println("       \\ \\__\\ \\ \\_______\\ \\_______\\ \\_______\\__/  / /    ");    
			System.out.println("        \\|__|  \\|_______|\\|_______|\\|_______|\\___/ /     ");     
			System.out.println("                                            \\|___|/      ");      
			
			System.out.println("Welcome to LW Toboy! Your Freshly Homemade Round Tofu Delivery Service");
			System.out.println("1. Customer Login");
			System.out.println("2. Register as Our Customer");
			System.out.println("3. Admin Login");
			System.out.println("4. Courier Login");
			System.out.println("5. Exit");
			System.out.println("Choose: ");
			try{
				choose = scan.nextInt();
			}catch(Exception e){
				
			}scan.nextLine();
			switch(choose){
			
			case 1:
				login = new LoginView(); 
				break;
				
			case 2:
				register = new RegisterView();
				break;
			case 3:
				adminLogin = new AdminLogin();
				break;
			
			case 4:
				courierLogin = new CourierLogin();
				break;
				
			}
		
		}while(choose!=5);
	}

	public MainView() {
		menu();

	}

}
