package model;

import java.util.ArrayList;

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
			instance = new DroidzManager();
		}
		return instance;
	}
	
	public ArrayList<Droid> getDroidListAt(String filtre){
		//return new ServiceDroidList().getDroidListFiltre(filtre);
		return droidList;		
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
		//Comment id vraiment necessaire?
		int commentId = 0;
		Droid droid = getDroid(droidId);
		Comment comment = new Comment(commentId, droidId, description, score);
		droid.addComment(comment);
	}

	@Override
	public String pay(CheckoutForm checkoutForm, Panier panier) {

		//Ajouter a la BD les lignes reservations et le formulaire contenant les infos client
		//Retourne le numero de confirmation, on considere que le paiement est toujours accepter
		
		return "AH67DA92JB8M";
	}
}
