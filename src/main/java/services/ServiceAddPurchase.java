package services;

import java.math.BigDecimal;

import model.LignePanier;
import model.Panier;

public class ServiceAddPurchase {
	
	
	public void addPurchase(Panier panier)
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/sales/add";
		
		BigDecimal taxes = panier.getTpsRound().add(panier.getTvqRound());
		
		String urlParameters = "partner_address_id=" + ""//problem
				+ "&partner_id=" + ""//problem
				+ "&amount_untaxed=" + panier.getSousTotalRound()
				+ "&amount_tax=" + taxes
				+ "&amount_total=" + panier.getPrixTotalRound();
		
		http.sendPost(url, urlParameters);
		
		for (int i = 0; i < panier.getListLignePanier().size(); i++) {
			addPurchaseLine(panier.getListLignePanier().get(i));
		}
	}
	
	private void addPurchaseLine(LignePanier ligne)
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/sales/addLine/";
		
		String urlParameters = "order_id =" + ""//problem
				+ "&price_unit=" + ligne.getDroid().getPrice()
				+ "&product_quantity=" + ligne.getNbDroids()
				+ "&partner_id=" + ""//problem
				+ "&product_id=" + ligne.getDroid().getId()
				+ "&name=" + ligne.getDroid().getName();
		
		http.sendPost(url, urlParameters);
	}
}
