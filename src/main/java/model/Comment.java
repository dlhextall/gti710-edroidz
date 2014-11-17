package model;

public class Comment
{
	private int id;
	private String comment;
	private int score;
	private int productId;
	
	public Comment(int id, int productId, String comment, int score) {
		this.id = id;
		this.productId = productId;
		this.comment = comment;
		this.score = score;
	}
	
	public int getId() {
		return id;
	}
	
	public String getComment() {
		return comment;
	}
	
	public int getScore() {
		return score;
	}
	
	public int getProductId() {
		return productId;
	}
}
