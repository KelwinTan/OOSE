package controller;

import repository.ToboyDatabase;

public class ViewOrderController {
	public ViewOrderController(){
		
	}
	public ViewOrderController(int index) {
		System.out.println(ToboyDatabase.courier.get(index).getOrderID());
	
	}

}
