package model;

public class Order {
	
	private int OrderID;
	private String OrderDate;
	private int Cost;
	private String PaymentMethod;
	
	public Order() {
		
	}
	
	public Order(int id, String date, int cost, String method){
		super();
		OrderID = id;
		OrderDate = date;
		Cost = cost;
		PaymentMethod = method;
		
	}
	public Order(String date, int cost, String method){
		super();
		OrderDate = date;
		Cost = cost;
		PaymentMethod = method;
	}

	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public String getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}

	public int getCost() {
		return Cost;
	}

	public void setCost(int cost) {
		Cost = cost;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

}
