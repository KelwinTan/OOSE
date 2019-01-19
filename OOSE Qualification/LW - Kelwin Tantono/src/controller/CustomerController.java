package controller;

import repository.ToboyDatabase;

public class CustomerController {

	public static int login(String email, String password){
		
		for(int i=0; i < ToboyDatabase.customers.size(); i++){
			String currEmail = ToboyDatabase.customers.get(i).getEmail();
			String currPass = ToboyDatabase.customers.get(i).getPassword();
			
			if(currEmail.equals(email) && currPass.equals(password)){
				return 1;
			}
		}
		return 0;
	}
	
	
	
	
	
	public static String getName(String email, String password){
		for(int i=0; i < ToboyDatabase.customers.size(); i++){
			String currEmail = ToboyDatabase.customers.get(i).getEmail();
			String currPass = ToboyDatabase.customers.get(i).getPassword();
			
			if(currEmail.equals(email) && currPass.equals(password)){
				return ToboyDatabase.customers.get(i).getName();
			}
		}
		return "No Name";
	}
	
	public static int getIndex(String email, String password){
		int index = 0;
		for(int i=0; i < ToboyDatabase.customers.size(); i++){
			String currEmail = ToboyDatabase.customers.get(i).getEmail();
			String currPass = ToboyDatabase.customers.get(i).getPassword();
			
			if(currEmail.equals(email) && currPass.equals(password)){
				index = i;
				return index;
			}
		}
		return -1;
	}		
	
	public static String getAddress(String email, String password){
		for(int i=0; i < ToboyDatabase.customers.size(); i++){
			String currEmail = ToboyDatabase.customers.get(i).getEmail();
			String currPass = ToboyDatabase.customers.get(i).getPassword();
			
			if(currEmail.equals(email) && currPass.equals(password)){
				return ToboyDatabase.customers.get(i).getAddress();
			}
		}
		return "No Address";
	}
	
	public CustomerController() {
		
	}

}
