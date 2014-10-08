package model;

import java.util.ArrayList;

public class Droid 
{
	private int id;
	private int quantityAvailable;
	private double price;
	private String name;
	private String description;
	private String imageName;
	private ArrayList<Comment> commentsList;
	private String promoImgName;
	
	//Skills
	private boolean canCombat;
	private boolean canCook;
	private boolean canGarden;
	private boolean canLaundry;
	private boolean canClean;
	private boolean canWashDishes;
	
	public Droid(int id, int quantityAvailable, double price, String name, 
			String description, String imageName, ArrayList<Comment> commentsList, String promoImgName,
			boolean canCombat, boolean canCook, boolean canGarden, 
			boolean canLaundry, boolean canClean, boolean canWashDishes ) {
		this.id = id;
		this.quantityAvailable = quantityAvailable;
		this.price = price;
		this.name = name;
		this.description = description;
		this.imageName = imageName;
		this.commentsList = commentsList;
		this.promoImgName = promoImgName;
		this.canCombat = canCombat;
		this.canCook = canCook;
		this.canGarden = canGarden;
		this.canLaundry = canLaundry;
		this.canClean = canClean;
		this.canWashDishes = canWashDishes;
	}
	
	public void addComment(Comment comment) {
		commentsList.add(comment);
	}

	public int getId() {
		return id;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImageName() {
		return imageName;
	}

	public ArrayList<Comment> getCommentsList() {
		return commentsList;
	}
	
	public String getPromoImgName() {
		return promoImgName;
	}

	public boolean isCanCombat() {
		return canCombat;
	}

	public boolean isCanCook() {
		return canCook;
	}

	public boolean isCanGarden() {
		return canGarden;
	}

	public boolean isCanLaundry() {
		return canLaundry;
	}

	public boolean isCanClean() {
		return canClean;
	}

	public boolean isCanWashDishes() {
		return canWashDishes;
	}
}
