package controller;

import repository.ToboyDatabase;

public class ViewCourierStatusController {

	public ViewCourierStatusController() {
		
	}
	
	public ViewCourierStatusController(int index){
		System.out.println(ToboyDatabase.courier.get(index).getName()+ToboyDatabase.courier.get(index).getStatus());
		
	}
	
	
}
