package ca.etsmtl.edroidz;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.CheckoutForm;
import model.Droid;
import model.LignePanier;
import model.Panier;

import org.springframework.beans.factory.annotation.Autowired;

public class SessionManager implements HttpSessionListener {

	@Autowired
	private Panier panier;
	@Autowired
	private CheckoutForm checkoutForm = new CheckoutForm();

	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {

		panier = new Panier();
		checkoutForm = new CheckoutForm();
		sessionEvent.getSession().setAttribute("panier", panier);
		sessionEvent.getSession().setMaxInactiveInterval(120);
		System.out.println("session created");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
	
		panier = new Panier();
		checkoutForm = new CheckoutForm();
		sessionEvent.getSession().setAttribute("panier", panier);
		System.out.println("Session Timer Current time is :: "+ new Date());
	}
}