package model;

public class RoundTofu {
	private String Flavour;
	private int Amount;
	
	public RoundTofu() {
		
	}
	
	
	
	public RoundTofu(String flavour, int amount) {
		super();
		Flavour = flavour;
		Amount = amount;
	}



	public String getFlavour() {
		return Flavour;
	}

	public void setFlavour(String flavour) {
		Flavour = flavour;
	}

	public int getAmount() {
		return Amount;
	}

	public void setAmount(int amount) {
		Amount = amount;
	}
	
	
}
