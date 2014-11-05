package model;

import java.util.ArrayList;

public interface ManagerInterface {
	
	public ArrayList<Droid> getDroidList();
	
	public ArrayList<Droid> getDroidListAt(String filtre);
	
	public ArrayList<Droid> getPromoList();

	public Droid getDroid(int droidId);
	
	public void addComment(int droidId, int score, String comment);
	
	public String pay(CheckoutForm checkoutForm, Panier panier);
}
