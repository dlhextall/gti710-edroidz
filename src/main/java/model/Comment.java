package model;

public class Comment
{
	private int id;
	private String comment;
	private int score;
	
	public Comment(int id, String comment, int score) {
		this.id = id;
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
}
