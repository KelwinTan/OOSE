package controller;

import java.util.Scanner;

import repository.ToboyDatabase;

public class UpdateCourierStatusController {
	public UpdateCourierStatusController(){
		
	}
	public UpdateCourierStatusController(int index) {
		String status;
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Round Tofu Status:");
		status = scan.nextLine();
		if(status.equals("Delivered")){
			ToboyDatabase.courier.get(index).setStatus("Not Delivering");;
		}else{
			ToboyDatabase.courier.get(index).setStatus("Still Delivering");;
		}
		
		
	}

}
