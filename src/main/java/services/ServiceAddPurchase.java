package services;

import java.math.BigDecimal;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.LignePanier;
import model.Panier;

public class ServiceAddPurchase {
	
	
	public int addPurchase(Panier panier, int partnerId, int partnerAdressId)
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/sales/add/";
		
		BigDecimal taxes = panier.getTpsRound().add(panier.getTvqRound());
		
		String urlParameters = //"partner_address_id=" + partnerId
				"&partner_id=" + partnerAdressId;
				//+ "&amount_untaxed=" + panier.getSousTotalRound()
				//+ "&amount_tax=" + taxes
				//+ "&amount_total=" + panier.getPrixTotalRound();
		
		String rep = http.sendPost(url, urlParameters);
		int purschaseId = 0;
		JSONParser parser = new JSONParser();
		
		try {
	    	Object obj = parser.parse(rep);
	    	JSONObject json = (JSONObject)obj;
	        
	    	purschaseId = Integer.parseInt(json.get("sale_order_id").toString());                
	        
	    } catch(ParseException pe) {
	    	  
	        System.out.println("position: " + pe.getPosition());
	        System.out.println(pe);
	    }
		
		for (int i = 0; i < panier.getListLignePanier().size(); i++) {
			addPurchaseLine(panier.getListLignePanier().get(i), purschaseId, partnerId);
		}
		
		return purschaseId;
	}
	
	private void addPurchaseLine(LignePanier ligne, int purschaseId, int partnerId)
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/sales/get/" + purschaseId + "/lines_add/";
		
		String urlParameters = "order_id =" + purschaseId
				//+ "&price_unit=" + ligne.getDroid().getPrice()
				+ "&quantity=" + ligne.getNbDroids()
				//+ "&partner_id=" + partnerId
				+ "&product_id=" + ligne.getDroid().getId();
				//+ "&name=" + ligne.getDroid().getName();
		
		String nope = http.sendPost(url, urlParameters);
	}
}
