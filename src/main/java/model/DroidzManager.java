package model;

import java.util.ArrayList;

import services.ServiceAddComment;
import services.ServiceAddAllProducts;
import services.ServiceAddPartner;
import services.ServiceAddPurchase;
import services.ServiceDroid;
import services.ServiceDroidList;

public class DroidzManager implements ManagerInterface
{	
	private static DroidzManager instance;
	private DroidzStub stub = new DroidzStub();
	private ArrayList<Droid> droidList = stub.createDroidList();
	private ArrayList<Droid> promoList = stub.getPromoList();
	
	private DroidzManager() { }
	
	public static DroidzManager getInstance()
	{
		if (instance == null) {
			//new ServiceAddAllProducts().addAllProducts();
			//new ServiceAddAllProducts().addAllComments();
			instance = new DroidzManager();
		}
		return instance;
	}
	
	public ArrayList<Droid> getDroidListAt(String filtre){
		//return new ServiceDroidList().getDroidListFiltre(filtre);
		return getDroidListFiltre(filtre);		
	}

	public ArrayList<Droid> getDroidList() {
		//return new ServiceDroidList().getService();
		return droidList;
	}
	
	public ArrayList<Droid> getPromoList() {
		//return new ServiceDroidList().getPromoList();
		return promoList;
	}

	public Droid getDroid(int droidId)
	{
		//return new ServiceDroid().getService(droidId);
		
		for (int i = 0; i < droidList.size(); i++)
		{
			if (droidList.get(i).getId() == droidId)
			{
				return droidList.get(i);
			}
		}
		
		return null;
	}

	public void addComment(int droidId, int score, String description)
	{
		int commentId = 0;
		Droid droid = getDroid(droidId);
		Comment comment = new Comment(commentId, droidId, description, score);
		//new ServiceAddComment(comment);
		droid.addComment(comment);
	}

	@Override
	public String pay(CheckoutForm checkoutForm, Panier panier) {
		
		new ServiceAddPartner().addPartner(checkoutForm);
		//new ServiceAddPurchase().addPurchase(panier);
		
		//Ajouter le numero de confirmation dans la bd???
		return "NH67DA92JB8M";
	}
	
	 
	//temp function, ne sera plus utile lorsque le service web sera lier
	private ArrayList<Droid> getDroidListFiltre(String filtre)
	{
		ArrayList<Droid> filteredList = new ArrayList<Droid>();
		
		for (int i = 0; i < droidList.size(); i++) 
		{
			if(filtre.equals("combat") && droidList.get(i).isCanCombat())
				filteredList.add(droidList.get(i));
			if(filtre.equals("cook") && droidList.get(i).isCanCook())
				filteredList.add(droidList.get(i));
			if(filtre.equals("garden") && droidList.get(i).isCanGarden())
				filteredList.add(droidList.get(i));
			if(filtre.equals("laundry") && droidList.get(i).isCanLaundry())
				filteredList.add(droidList.get(i));
			if(filtre.equals("clean") && droidList.get(i).isCanClean())
				filteredList.add(droidList.get(i));
			if(filtre.equals("dish") && droidList.get(i).isCanWashDishes())
				filteredList.add(droidList.get(i));
		}
		
		return filteredList;
	}
}
