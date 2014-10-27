package ca.etsmtl.edroidz;

import java.io.StringReader;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import model.CheckoutForm;
import model.DroidzManager;
import model.Panier;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;


/**
 * Handles requests for the application home page.
 */
@Controller
public class CheckoutController {
	
	private static final Logger logger = Logger.getLogger(CheckoutController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public ModelAndView checkout() {
		
		ModelAndView model = new ModelAndView("checkout");
		model.addObject("checkoutForm", new CheckoutForm());
		
		return model;
	}

	@RequestMapping(value = "/checkout", method = RequestMethod.POST)
	public ModelAndView checkoutPOSTREST(@Validated @ModelAttribute("checkoutForm") CheckoutForm _checkoutForm, 
			RedirectAttributes redirectAttributes, BindingResult _res, HttpServletRequest _req) {
		
		ModelAndView model;
		
		//Errors in checkout form
		if (_res.hasErrors()) {			 
			model = new ModelAndView("redirect:/checkout");
			model.addObject("errors", _res.getAllErrors());
			logger.error("CheckoutForm has errors");
			for (ObjectError err : _res.getAllErrors()) {
				logger.error("CheckoutForm error : " + err);
			}
			return model;
		}
		
		HttpSession session = _req.getSession();
		Panier panier = (Panier) session.getAttribute("panier");
		model = new ModelAndView("redirect:/confirmation");
		
		//Effectue le paiement, retourne le numero de confirmation
		String noConfirmation = DroidzManager.getInstance().pay(_checkoutForm, panier);
		
		model.addObject("noConfirmation", noConfirmation );
		model.addObject("panier", panier );
		//BUGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
		//model.addObject("checkoutForm2", _checkoutForm );
		
		return model;
	}
}
