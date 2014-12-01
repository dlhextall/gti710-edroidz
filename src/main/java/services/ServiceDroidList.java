package services;

import java.awt.dnd.DragSourceAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	        int i = 0;
	        Iterator it = array.iterator();	        
	        while (it.hasNext()) {
	        	
	            JSONObject json = (JSONObject) it.next();
	            
	    		String category = json.get("categ_id").toString().replaceAll("[^0-9]","");
	            
	            if(Integer.parseInt(category) == 19) //droid category = 19
	            {
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
		            
		            System.out.println(i+" - "+droid.getName());
		            droidList.add(droid);
		            i++;
	            }
	        }
	        
	        Collections.swap(droidList, 0, 34);
	        Collections.swap(droidList, 1, 13);
	        Collections.swap(droidList, 2, 32);
	        Collections.swap(droidList, 3, 41);
	        Collections.swap(droidList, 4, 35);
	        Collections.swap(droidList, 5, 37);
	        Collections.swap(droidList, 6, 39);
	        Collections.swap(droidList, 7, 38);
	        Collections.swap(droidList, 8, 23);
	        Collections.swap(droidList, 9, 23);
	        Collections.swap(droidList, 10, 43);
	        Collections.swap(droidList, 11, 30);
	        Collections.swap(droidList, 12, 35);
	        Collections.swap(droidList, 13, 32);
	        Collections.swap(droidList, 14, 43);
	        Collections.swap(droidList, 15, 41);
	        Collections.swap(droidList, 16, 35);
	        Collections.swap(droidList, 17, 36);
	        
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
			if(droidList.get(i).getPromoImgName() != null && !droidList.get(i).getPromoImgName().equals("") & !droidList.get(i).getPromoImgName().equals("false"))
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
