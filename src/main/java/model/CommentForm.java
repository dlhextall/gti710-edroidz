package model;

public class CommentForm {
	
	private String comment;
	private int score;
	
	public CommentForm() { }
	
	public String getComment() {
		return comment;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return getClass().getName() + " New comment " + getComment() + ", Score : " + getScore();
	}
}