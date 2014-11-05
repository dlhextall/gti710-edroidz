package ca.etsmtl.edroidz;

import javax.servlet.http.HttpServletRequest;



import javax.servlet.http.HttpSession;

import model.CheckoutForm;
import model.DroidzManager;
import model.Panier;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ConfirmController{

	@RequestMapping(value = "/confirmation", method = RequestMethod.GET)
	public ModelAndView confirmation(HttpServletRequest _req) {
		
		ModelAndView model = new ModelAndView("confirmation");
		
		HttpSession session = _req.getSession();
		Panier panier = (Panier) session.getAttribute("panier");
		CheckoutForm checkoutForm = (CheckoutForm) session.getAttribute("checkoutForm");
		String noConfirmation = DroidzManager.getInstance().pay(checkoutForm, panier);
		
		model.addObject("noConfirmation", noConfirmation );
		model.addObject("panier", panier );
		model.addObject("checkoutForm", checkoutForm );
		
		session.invalidate();
		
		return model;
	}
}
