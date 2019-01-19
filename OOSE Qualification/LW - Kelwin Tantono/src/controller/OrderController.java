package controller;

import java.util.Scanner;

import model.Order;
import repository.ToboyDatabase;

public class OrderController {

	public OrderController() {
		
	}
	
	public OrderController(int index){
		int amount;
		String Date;
		String method;
		
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Input Amount of Round Tofu: ");
		amount = scan.nextInt(); scan.nextLine();
		
		System.out.println("Input Date to be Delivered [dd-mm-yyyy]: ");
		Date = scan.nextLine();
		
		System.out.println("Input Payment Method: ");
		method = scan.nextLine();
		
		ToboyDatabase.order.add(new Order(index, Date, amount, method));
		
		
		
	}

}
