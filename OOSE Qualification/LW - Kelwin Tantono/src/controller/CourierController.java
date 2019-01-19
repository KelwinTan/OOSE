package controller;

import repository.ToboyDatabase;

public class CourierController {

	public CourierController() {
		
	
	}

	public static int login(String email, String password){
		
		for(int i=0; i < ToboyDatabase.courier.size(); i++){
			String currEmail = ToboyDatabase.courier.get(i).getEmail();
			String currPass = ToboyDatabase.courier.get(i).getPassword();
			
			if(currEmail.equals(email) && currPass.equals(password)){
				return 1;
			}
		}
		return 0;
	}
	
	public static int getIndex(String email, String password){
		int index = 0;
		for(int i=0; i < ToboyDatabase.courier.size(); i++){
			String currEmail = ToboyDatabase.courier.get(i).getEmail();
			String currPass = ToboyDatabase.courier.get(i).getPassword();
			
			if(currEmail.equals(email) && currPass.equals(password)){
				index = i;
				return index;
			}
		}
		return -1;
	}	

}
