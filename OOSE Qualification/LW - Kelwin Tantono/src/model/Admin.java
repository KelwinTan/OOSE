package model;

public class Admin extends User {

	private int AdminID;
	
	public Admin() {
		
	
	}
	
	public Admin(int adminID, String name, String email, String password) {
		super();
		AdminID = adminID;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public int getAdminID() {
		return AdminID;
	}

	public void setAdminID(int adminID) {
		AdminID = adminID;
	}
	
	
	
}
