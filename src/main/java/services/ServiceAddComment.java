package services;

import model.Comment;

public class ServiceAddComment {

	public ServiceAddComment(Comment comment)
	{
		String urlParameters = "comment_text=" + comment.getComment()
				+ "&note=" + comment.getScore();
		
		String url = "http://127.0.0.1:8000/products/get/" + comment.getProductId() + "/comments/add";
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();		
		String nope = http.sendPost(url, urlParameters);
	}
}
