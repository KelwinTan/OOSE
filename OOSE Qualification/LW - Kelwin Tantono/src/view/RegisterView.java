package view;

import java.util.Scanner;

import model.Admin;
import model.Courier;
import model.Customer;
import repository.ToboyDatabase;

public class RegisterView {
	
	public RegisterView() {
		int customerCount = 0;
		String email = "";
		String password = "";
		String address = "";
		String name = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Full Name: ");
		name = scan.nextLine();
		
		System.out.println("Enter Your Email: ");
		email = scan.nextLine();
		
		System.out.println("Enter Your New Password: ");
		password = scan.nextLine();
		
		System.out.println("Enter Your Address: ");
		address = scan.nextLine();
		
		ToboyDatabase.customers.add(new Customer(customerCount, name, email, password));
//		There is only one Admin Accosunt 
		ToboyDatabase.admin.add(0, new Admin(0, "admin@admin.com", "Admin", "Admin"));
//		There are only three Toboy Couriers 
		
	
	}

}
