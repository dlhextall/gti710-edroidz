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
	
	private int reserve = 0;
	
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
		commentsList.add(0, comment);
	}

	public int getId() {
		return id;
	}

	public int getQuantityAvailable() {
		return quantityAvailable - reserve;
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

	public void addReserve(int number) {
		this.reserve += number;
	}
	
	public int getAverageScore()
	{		
		double total = 0;
		
		for (int i = 0; i < commentsList.size(); i++) {
			total += commentsList.get(i).getScore();
		}
		
		if(total == 0)
			return 0;
		
		return (int) Math.ceil(total/commentsList.size());
	}
}
