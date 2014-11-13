package amazone;

import java.util.ArrayList;

import model.Comment;

public class Amazones {	
	
	private String title;
	private String description;
	private String imageName;
	private String url;		
	
	public Amazones(String title, String description, String imageName, String url) {
		this.title = title;
		this.description = description;
		this.imageName = imageName;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

	
	
	

}
