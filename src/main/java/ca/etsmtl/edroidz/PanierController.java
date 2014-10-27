package ca.etsmtl.edroidz;


import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.Droid;
import model.DroidzManager;
import model.Panier;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;



@Controller
@SessionAttributes("panier")
public class PanierController {
	
	private static final Logger logger = Logger.getLogger(PanierController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/panier", method = RequestMethod.GET)
	public String panier(HttpServletRequest request) {		
		
		HttpSession session = request.getSession();
		Panier panier = (Panier) session.getAttribute("panier");
		
		if (panier == null) 
			panier = new Panier();
		
		
		//---------- TO DELETE AFTER TEST -----------
		Droid droid = new Droid(49, 100, 4999.99, "Seyfried Model", "", "49", null, "img1",
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		panier.addLignePanier(droid, 1);
		//---------- STOP -----------
		
		session.setAttribute("panier", panier);
		
		return "panier";
	}
	
	@RequestMapping(value = "/panier/add", method = RequestMethod.GET)
	public String add(HttpServletRequest request,Locale locale, Model model) {
		
		HttpSession session = request.getSession();
		Panier panier = (Panier) session.getAttribute("panier");
		int idDroid = 0;
		int nbDroids = 0;
		
		if (panier == null) 
			panier = new Panier();
		
		if(request.getParameter("nbDroids") != null) {
			
			try {
				idDroid = Integer.parseInt(request.getParameter("idDroid"));
				nbDroids = Integer.parseInt(request.getParameter("nbDroids"));
			} catch (Exception e) {
				logger.error("Shopping cart remove line error : " + e);
			}
			
			Droid droid = DroidzManager.getInstance().getDroid(idDroid);
			panier.addLignePanier(droid, nbDroids);
			
			session.setAttribute("panier", panier);
		}
		
		return "panier";		
	}
	
	@RequestMapping(value = "/panier/delete", method = RequestMethod.GET)
	public String delete(HttpServletRequest request, Model model) {
		
		if (request.getParameter("id") != null) {
			
			HttpSession session = request.getSession();
			Panier panier = (Panier) session.getAttribute("panier");
			
			if (panier == null) 
				panier = new Panier();
			
			try {
				panier.removeLignePanier(Integer.parseInt(request.getParameter("id")));
			} catch (Exception e) {
				logger.error("Shopping cart remove line error : " + e);
			}			
			
			session.setAttribute("panier", panier);
		}
		
		return "panier";
	}
}
