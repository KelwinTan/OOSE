package controller;

import java.util.Scanner;

import repository.ToboyDatabase;

public class HandleOrderController {

	public HandleOrderController() {
		Scanner scan = new Scanner(System.in);
		int courNum;
		int orderNum;
		
		for(int i=0; i<ToboyDatabase.courier.size(); i++){
			System.out.println(i+ToboyDatabase.courier.get(i).getName()+" : "+ToboyDatabase.courier.get(i).getStatus());
		}
		
		for(int i=0; i<ToboyDatabase.order.size(); i++){
			System.out.println(i+ToboyDatabase.order.get(i).getOrderDate() +" "+ToboyDatabase.order.get(i).getOrderID());
		}
		System.out.println("Assign Driver:");
		courNum = scan.nextInt(); scan.nextLine();
		
		System.out.println("Assign Order:");
		orderNum = scan.nextInt(); scan.nextLine();
		
		ToboyDatabase.courier.get(courNum).setStatus("Deliver Order ID "+orderNum);
		ToboyDatabase.courier.get(courNum).setOrderID(orderNum);
		
	}

}
