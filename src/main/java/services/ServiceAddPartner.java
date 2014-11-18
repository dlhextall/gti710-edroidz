package services;

import model.CheckoutForm;

public class ServiceAddPartner {
	
	
	public void addPartner(CheckoutForm form)
	{
		ServiceHttpUrlConnection http = new ServiceHttpUrlConnection();
		String url = "http://127.0.0.1:8000/partners/add/";
		
		String urlParameters = "name=" + form.getFirstName() + " " + form.getLastName()
				+ "&phone=" + form.getTelephone()
				+ "&street=" + form.getAddress()
				+ "&city=" + form.getCity()
				+ "&zip=" + form.getPostalCode()
				+ "&country_id=36";
			
		http.sendPost(url, urlParameters);	
	}
}
