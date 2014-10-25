package ca.etsmtl.edroidz;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import model.Droid;
import model.LignePanier;
import model.Panier;

import org.springframework.beans.factory.annotation.Autowired;

public class SessionManager implements HttpSessionListener {

	@Autowired
	private Panier panier;

	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {

		panier = new Panier();
		sessionEvent.getSession().setAttribute("panier", panier);
		sessionEvent.getSession().setMaxInactiveInterval(120);
		System.out.println("session created");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		
		if(sessionEvent.getSession().getAttribute("panier") != null) {
			int cptRestored=0;
			Panier panier = (Panier)sessionEvent.getSession().getAttribute("panier");
			/*List<LignePanier> billetPanier = panier.getLstBilletPanier();
			
			for(int i=0;i<billetPanier.size();i++){
				List<Ticket>lstBillet = spectacle.get(billetPanier.get(i).getIdSpectacle()).getRepresentations().get(billetPanier.get(i).getIdRepresentation()).getBillets();
				
				for(int j=0;j<lstBillet.size();j++){
					if(lstBillet.get(j).getState().equals(State.RESERVED)){
						lstBillet.get(j).setState(State.AVAILABLE);
					}
				}
			}	*/		
		}
		else
			panier = new Panier();
		
		panier.clearPanier();
		sessionEvent.getSession().setAttribute("panier", panier);
		System.out.println("Session Timer Current time is :: "+ new Date());
	}
}