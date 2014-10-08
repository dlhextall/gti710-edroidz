package ca.etsmtl.edroidz;

import java.util.Locale;
import model.Droid;
import model.DroidzManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DetailController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/detail?id={id}", method = RequestMethod.GET)
	public String detail(@PathVariable("id") int _droidId, Locale locale, Model model) {		
		
		Droid droid = DroidzManager.getInstance().getDroid(_droidId);
		
		if (droid == null)
			System.out.println("Le droid est introuvable.");
		
		model.addAttribute("promoList", droid );
				
		return "detail";
	}
}
