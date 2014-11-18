package services;

import model.Comment;

public class ServiceAddComment {

	public ServiceAddComment(Comment comment)
	{
		String urlParameters = "comment=" + comment.getComment()
				+ "&score=" + comment.getScore()
				+ "&productId="  + comment.getProductId();
		
		String url = "http://127.0.0.1:8000/comments/add/";
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();		
		http.sendPost(url, urlParameters);
	}
}
