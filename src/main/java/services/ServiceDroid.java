package services;

import java.util.ArrayList;

import model.Comment;
import model.Droid;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServiceDroid {
	
	public Droid getService(int droidId)
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		
		String url = "http://127.0.0.1:8000/products/get/" + droidId;
		String response = http.sendGet(url);		
		JSONParser parser = new JSONParser();
		
	    try {
	    	Object obj = parser.parse(response);
	        JSONObject json = (JSONObject)obj;
	            
	        ArrayList<Comment> commentList = new ServiceComments().getComments(Integer.parseInt(json.get("id").toString()));
        	
	        int quantity;
	        if (json.get("qty_available") == null)
	        	quantity = 0;
	        else
	        	quantity = (int) Double.parseDouble(json.get("qty_available").toString());
	        
            Droid droid = new Droid(
            	Integer.parseInt(json.get("id").toString()), //id
            	quantity, //quantity
            	Double.parseDouble(json.get("list_price").toString()), //price
            	json.get("name").toString(), //name
            	json.get("description_purchase").toString(), //description
            	json.get("x_img_name").toString(), //image name
            	commentList, //comments list
            	json.get("x_img_name_promo").toString(), //promoImgName
            	Boolean.valueOf(json.get("x_combat").toString()), //combat
            	Boolean.valueOf(json.get("x_cook").toString()), //cook
            	Boolean.valueOf(json.get("x_garden").toString()), //garden
            	Boolean.valueOf(json.get("x_laundry").toString()), //laundry
            	Boolean.valueOf(json.get("x_clean").toString()), //clean
            	Boolean.valueOf(json.get("x_wash_dishes").toString())); //washDishes
            
            return droid;
        
	    } catch(ParseException pe) {
	    	  
	        System.out.println("position: " + pe.getPosition());
	        System.out.println(pe);
	    }
	    
		return null;
	}
}
