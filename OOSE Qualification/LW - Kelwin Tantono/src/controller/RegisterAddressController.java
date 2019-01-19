package controller;

import java.util.Scanner;

import repository.ToboyDatabase;

public class RegisterAddressController {

	public RegisterAddressController() {
	
	}
	
	public RegisterAddressController(int index){
		Scanner scan = new Scanner(System.in);
		String address = "";
		
		System.out.println("Input Your Address:");
		address = scan.nextLine();
		
		ToboyDatabase.customers.get(index).setAddress(address);
		System.out.println("Register successful!");
	}

}
