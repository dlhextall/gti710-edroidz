package services;

import java.util.ArrayList;
import java.util.Iterator;

import model.CheckoutForm;
import model.Comment;
import model.Droid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServiceAddPartner {
	
	
	public ArrayList<Integer> addPartner(CheckoutForm form)
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/partners/add";

		String urlParameters = "name=" + form.getFirstName() + " " + form.getLastName()
				+ "&phone=" + form.getTelephone()
				+ "&street=" + form.getAddress()
				+ "&street2=" + form.getAddress()
				+ "&city=" + form.getCity()
				+ "&zip=" + form.getPostalCode()
				+ "&email=none";
				//+ "&country_id=36";
		
		String rep = http.sendPost(url, urlParameters);
		ArrayList<Integer> partnerIds = new ArrayList<Integer>();
		JSONParser parser = new JSONParser();
		
		try {
	    	Object obj = parser.parse(rep);
	    	JSONObject json = (JSONObject)obj;
	        
	        partnerIds.add(Integer.parseInt(json.get("partner_id").toString()));
	        partnerIds.add(Integer.parseInt(json.get("partner_address_id").toString()));
	            
	        return partnerIds;	                
	        
	    } catch(ParseException pe) {
	    	  
	        System.out.println("position: " + pe.getPosition());
	        System.out.println(pe);
	    }
		
		return null;
	}
}
