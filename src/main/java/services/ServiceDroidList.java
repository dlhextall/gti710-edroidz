package services;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.Droid;

import org.json.simple.JSONObject;

public class ServiceDroidList {
	
	public ServiceDroidList()
	{
		ArrayList<Droid> droidList = new ArrayList<Droid>();
		
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/products/list/";
		String response = http.sendGet(url);
		
		Pattern pattern = Pattern.compile("\\{(.*?)\\}");
		Matcher matcher = pattern.matcher(response);
		
		while(matcher.find()) 
		{
			JSONObject jSon = new JSONObject();
			jSon.put("product", matcher.group(1));
			//jSon.get(0).categ_id;
			
			//if(jSon.get("categ_id") == 19)
			//	System.out.println("ok");

			//myBill.add(new Bill(jSon.getString("partner_id").split("\"")[1], jSon.getString("date_order"), jSon.getString("name"),
			//		jSon.getString("amount_total"), populateRobotList(jSon.getString("order_line"))));

		} 
	}
}
