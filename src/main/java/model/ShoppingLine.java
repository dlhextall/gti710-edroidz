package model;

public class ShoppingLine
{
	private int id;
	private int quantity;
	private double total;
	private Droid droid;
	
	public ShoppingLine(int id, Droid droid, int quantity) {
		this.id = id;
		this.droid = droid;
		this.quantity = quantity;
		this.total = quantity * droid.getPrice();
	}
	
	public int getId() {
		return id;
	}
	
	public Droid getDroid() {
		return droid;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getTotal() {
		return total;
	}
}
