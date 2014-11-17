package services;

import java.util.ArrayList;
import java.util.Iterator;

import model.Comment;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ServiceComments {
	
	private ArrayList<Comment> allCommentList = new ArrayList<Comment>();
	
	public ServiceComments()
	{
		ArrayList<Comment> commentList = new ArrayList<Comment>();
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		JSONParser parser = new JSONParser();
		
		String url = "http://127.0.0.1:8000/comments/list/";
		String response = http.sendGet(url);
		
		try {
	    	Object obj = parser.parse(response);
	        JSONArray array = (JSONArray) obj;
	        
	        Iterator it = array.iterator();	        
	        while (it.hasNext()) {
	        	
	            JSONObject commentJson = (JSONObject) it.next();
	            
	            Comment comment = new Comment(
	            		Integer.parseInt(commentJson.get("id").toString()), //id
	            		Integer.parseInt(commentJson.get("product_id").toString()), //productId
	            		commentJson.get("comment_text").toString(), //comment
	            		Integer.parseInt(commentJson.get("note").toString())); //score
	            	            
	            commentList.add(comment);
	        }
	        
	    } catch(ParseException pe) {
	    	  
	        System.out.println("position: " + pe.getPosition());
	        System.out.println(pe);
	    }
	}

	public ArrayList<Comment> getComments(int droidId)
	{
		ArrayList<Comment> commentList = new ArrayList<Comment>();
		
		for (int i = 0; i < allCommentList.size(); i++)
		{
			Comment comment = allCommentList.get(i);
			
			if(comment.getProductId() == droidId)
				commentList.add(comment);
		}
		
		return commentList;
	}
}
