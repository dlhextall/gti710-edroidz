package controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class CatalogueController {
	
		
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/catalogue", method = RequestMethod.GET)
	public String catalogue(Locale locale, Model model) {			
		return "catalogue";
	}
}
