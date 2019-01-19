package model;

public class Courier extends User {
	private int CourierID;
	private String Status;
	private int OrderID;
	public Courier() {
		
	}
	
	public Courier(int courierID, String name, String email, String password, String status) {
		super();
		CourierID = courierID;
		this.email = email;
		this.name = name;
		this.password = password;
		Status = status;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getCourierID() {
		return CourierID;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public void setCourierID(int courierID) {
		CourierID = courierID;
	}


}
