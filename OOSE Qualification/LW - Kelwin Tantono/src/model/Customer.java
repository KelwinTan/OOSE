package model;

public class Customer extends User {
	
	private int CustomerID;
	private String address;
	
	public Customer() {
		
	}
	
	public Customer(int customerID, String name, String email, String password) {
		super();
		CustomerID = customerID;
		this.email = email;
		this.name = name;
		this.password = password;
	}
	
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
