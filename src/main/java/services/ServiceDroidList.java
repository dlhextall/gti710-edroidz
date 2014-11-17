package services;

import java.awt.dnd.DragSourceAdapter;
import java.util.ArrayList;
import java.util.Iterator;

import model.Comment;
import model.Droid;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServiceDroidList {
	
	public ArrayList<Droid> getService()
	{
		ArrayList<Droid> droidList = new ArrayList<Droid>();
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		
		String url = "http://127.0.0.1:8000/products/list/";
		String response = http.sendGet(url);		
		JSONParser parser = new JSONParser();
		
	    try {
	    	Object obj = parser.parse(response);
	        JSONArray array = (JSONArray) obj;
	        
	        Iterator it = array.iterator();	        
	        while (it.hasNext()) {
	        	
	            JSONObject json = (JSONObject) it.next();
	            
	            if(Integer.parseInt(json.get("categ_id").toString()) == 19) //droid category = 19
	            {
	            	ArrayList<Comment> commentList = new ServiceComments().getComments(Integer.parseInt(json.get("id").toString()));
	            	
		            Droid droid = new Droid(
		            		Integer.parseInt(json.get("id").toString()), //id
		            		Integer.parseInt(json.get("quantity").toString()), //quantity
		            		Double.parseDouble(json.get("list_price").toString()), //price
		            		json.get("name").toString(), //name
		            		json.get("description_purchase").toString(), //description
		            		json.get("img_name").toString(), //image name
		            		commentList, //comments list
		            		json.get("img_name_promo").toString(), //promoImgName
		            		Boolean.valueOf(json.get("combat").toString()), //combat
		            		Boolean.valueOf(json.get("cook").toString()), //cook
		            		Boolean.valueOf(json.get("garden").toString()), //garden
		            		Boolean.valueOf(json.get("laundry").toString()), //laundry
		            		Boolean.valueOf(json.get("clean").toString()), //clean
		            		Boolean.valueOf(json.get("wash_dishes").toString())); //washDishes
		            
		            droidList.add(droid);
	            }
	        }
	        
	    } catch(ParseException pe) {
	    	  
	        System.out.println("position: " + pe.getPosition());
	        System.out.println(pe);
	    }
	    
	    return droidList;
	}
	
	public ArrayList<Droid> getPromoList()
	{
		ArrayList<Droid> droidList = getService();
		ArrayList<Droid> promo = new ArrayList<Droid>();
		
		for (int i = 0; i < droidList.size(); i++) 
		{
			if(droidList.get(i).getPromoImgName() != null && droidList.get(i).getPromoImgName() != "")
				promo.add(droidList.get(i));
		}
		
		return promo;
	}
	
	public ArrayList<Droid> getDroidListFiltre(String filtre)
	{
		ArrayList<Droid> droidList = getService();
		ArrayList<Droid> filteredList = new ArrayList<Droid>();
		
		for (int i = 0; i < droidList.size(); i++) 
		{
			if(filtre.equals("combat") && droidList.get(i).isCanCombat())
				filteredList.add(droidList.get(i));
			if(filtre.equals("cook") && droidList.get(i).isCanCook())
				filteredList.add(droidList.get(i));
			if(filtre.equals("garden") && droidList.get(i).isCanGarden())
				filteredList.add(droidList.get(i));
			if(filtre.equals("laundry") && droidList.get(i).isCanLaundry())
				filteredList.add(droidList.get(i));
			if(filtre.equals("clean") && droidList.get(i).isCanClean())
				filteredList.add(droidList.get(i));
			if(filtre.equals("dish") && droidList.get(i).isCanWashDishes())
				filteredList.add(droidList.get(i));
		}
		
		return filteredList;
	}
}
