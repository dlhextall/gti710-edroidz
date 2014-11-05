package ca.etsmtl.edroidz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Droid;
import model.DroidzManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CatalogueController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/catalogue", method = RequestMethod.GET)
	public String catalogue(Locale locale, Model model) {
		
		ArrayList<Droid> droidList = DroidzManager.getInstance().getDroidList();
		model.addAttribute("droidList", droidList );
		
		return "catalogue";
	}
	
	@RequestMapping(value = "/catalogue/{filtre}", method = RequestMethod.GET)
	public String catalogue1(@PathVariable("filtre") String _filtre, Locale locale, Model model) {
		
		ArrayList<Droid> droidList = DroidzManager.getInstance().getDroidListAt(_filtre);
		model.addAttribute("droidList", droidList );
		
		return "catalogue";
	}
}
