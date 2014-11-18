package services;

import java.util.ArrayList;

import model.Comment;
import model.Droid;
import model.DroidzStub;

public class ServiceAddAllProducts {

	public void addAllProducts()
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/products/add/";
		
		DroidzStub stub = new DroidzStub();
		ArrayList<Droid> droidList = stub.createDroidList();
		
		for (int i = 0; i < droidList.size(); i++)
		{
			Droid droid = droidList.get(i);
			
			String urlParameters = "name=" + droid.getName()
					+ "&description_purchase=" + droid.getDescription()
					+ "&list_price=" + round(droid.getPrice(), 2)
					+ "&img_name=" + droid.getImageName()
					+ "&img_name_promo=" + droid.getPromoImgName()
					+ "&quantity=" + droid.getQuantityAvailable()
					+ "&combat =" + droid.isCanCombat()
					+ "&cook=" + droid.isCanCook()
					+ "&garden=" + droid.isCanGarden()
					+ "&laundry=" + droid.isCanGarden()
					+ "&clean=" + droid.isCanClean()
					+ "&wash_dishes=" + droid.isCanWashDishes()
					+ "&categ_id=19";
			
			http.sendPost(url, urlParameters);
		}		
	}
	
	public void addAllComments()
	{
		ServiceDroidList service = new ServiceDroidList();
		ArrayList<Droid> droidList = service.getService();
		
		for (int i = 0; i < droidList.size(); i++)
		{
			Droid droid = droidList.get(i);
			
			for (int j = 0; j < droid.getCommentsList().size(); j++)
			{
				droid.getCommentsList().get(i).setProductId(droid.getId());
				new ServiceAddComment(droid.getCommentsList().get(i));
			}
		}
	}
	
	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    long factor = (long) Math.pow(10, places);
	    value = value * factor;
	    long tmp = Math.round(value);
	    return (double) tmp / factor;
	}
}
