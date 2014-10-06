package model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart 
{
	private int id;
	private double subTotal;
	private double tps;
	private double tvq;
	private double total;
	private String state;
	private List<ShoppingLine> lineList = new ArrayList<ShoppingLine>();
	
	public ShoppingCart(int id, String state, List<ShoppingLine> lineList) {
		this.id = id;
		this.state = state;
		this.lineList = lineList;		
		updateTotal();
	}
	
	private void updateTotal() {
		
		double tempTotal = 0;
		
		for (int i = 0; i < lineList.size(); i++) {
			tempTotal += lineList.get(i).getTotal();
		}
		
		subTotal = tempTotal;
		tps = subTotal * 0.05;	
		tvq = subTotal * 0.09975;
		total = subTotal + tps + tvq;
	}
	
	public void removeItem (int lineId) {
		for (int i = 0; i < lineList.size(); i++) {
			if (lineList.get(i).getId() == lineId)
				lineList.remove(i);
		}
		
		updateTotal();
	}
	
	public void addItem (ShoppingLine line) {
		lineList.add(line);
	}

	public int getId() {
		return id;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public double getTps() {
		return tps;
	}

	public double getTvq() {
		return tvq;
	}

	public double getTotal() {
		return total;
	}

	public String getState() {
		return state;
	}

	public List<ShoppingLine> getLineList() {
		return lineList;
	}
}
