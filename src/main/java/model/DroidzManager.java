package model;

import java.util.ArrayList;

import services.ServiceAddComment;
import services.ServiceAddPartner;
import services.ServiceAddPurchase;
import services.ServiceDroid;
import services.ServiceDroidList;

public class DroidzManager implements ManagerInterface
{	
	private static DroidzManager instance;
	//private DroidzStub stub = new DroidzStub();
	//private ArrayList<Droid> droidList = stub.createDroidList();
	//private ArrayList<Droid> promoList = stub.getPromoList();
	
	private ServiceDroidList service = new ServiceDroidList();
	private ArrayList<Droid> list = new ServiceDroidList().getService();
	
	private DroidzManager() { }
	
	public static DroidzManager getInstance()
	{
		if (instance == null) {
			instance = new DroidzManager();
		}
		return instance;
	}
	
	public ArrayList<Droid> getDroidListAt(String filtre){
		return service.getDroidListFiltre(list, filtre);
		//return new ServiceDroidList().getDroidListFiltre(filtre);
		//return getDroidListFiltre(filtre);		
	}

	public ArrayList<Droid> getDroidList() {
		return list;
		//return new ServiceDroidList().getService();
		//return droidList;
	}
	
	public ArrayList<Droid> getPromoList() {
		return service.getPromoList(list);
		//return new ServiceDroidList().getPromoList();
		//return promoList;
	}

	public Droid getDroid(int droidId)
	{
		//return new ServiceDroid().getService(droidId);
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).getId() == droidId)
			{
				return list.get(i);
			}
		}
		
		return null;
		
		/*
		for (int i = 0; i < droidList.size(); i++)
		{
			if (droidList.get(i).getId() == droidId)
			{
				return droidList.get(i);
			}
		}
		
		return null;*/
	}

	public void addComment(int droidId, int score, String description)
	{
		int commentId = 0;
		Droid droid = getDroid(droidId);
		Comment comment = new Comment(commentId, droidId, description, score);
		new ServiceAddComment(comment);
		droid.addComment(comment);
	}

	@Override
	public String pay(CheckoutForm checkoutForm, Panier panier) {
		
		ArrayList<Integer> partnerIds = new ServiceAddPartner().addPartner(checkoutForm);
		int purchaseId = new ServiceAddPurchase().addPurchase(panier, partnerIds.get(0), partnerIds.get(1));
		
		list = new ServiceDroidList().getService();
		
		//id de la purchase
		return String.valueOf(purchaseId + "NHZ2L0D34");
	}
	
	 
	//temp function, ne sera plus utile lorsque le service web sera lier
	private ArrayList<Droid> getDroidListFiltre(String filtre)
	{
		ArrayList<Droid> filteredList = new ArrayList<Droid>();
		
		for (int i = 0; i < list.size(); i++) 
		{
			if(filtre.equals("combat") && list.get(i).isCanCombat())
				filteredList.add(list.get(i));
			if(filtre.equals("cook") && list.get(i).isCanCook())
				filteredList.add(list.get(i));
			if(filtre.equals("garden") && list.get(i).isCanGarden())
				filteredList.add(list.get(i));
			if(filtre.equals("laundry") && list.get(i).isCanLaundry())
				filteredList.add(list.get(i));
			if(filtre.equals("clean") && list.get(i).isCanClean())
				filteredList.add(list.get(i));
			if(filtre.equals("dish") && list.get(i).isCanWashDishes())
				filteredList.add(list.get(i));
		}
		
		return filteredList;
	}
}
