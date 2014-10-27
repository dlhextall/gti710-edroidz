package ca.etsmtl.edroidz;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.CommentForm;
import model.Droid;
import model.DroidzManager;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DetailController {
	
	private static final Logger logger = Logger.getLogger(DetailController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public ModelAndView detail(@PathVariable("id") int _droidId, HttpServletRequest _req) {
		
		Droid droid = DroidzManager.getInstance().getDroid(_droidId);
		
		if (droid == null)
			System.out.println("Le droid est introuvable.");
		
		ModelAndView model = new ModelAndView("detail");
		model.addObject("droid", droid );
		model.addObject("commentForm", new CommentForm());
				
		return model;
	}
	
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.POST)
	public ModelAndView detailPOSTREST(@Validated @ModelAttribute("commentForm") CommentForm _commentForm,
			@PathVariable("id") int _droidId, BindingResult _res) {
		
		ModelAndView model = new ModelAndView("redirect:/detail/" + _droidId);
		
		//Errors in comment form
		if (_res.hasErrors()) {			 
			model.addObject("errors", _res.getAllErrors());
			logger.error("CommentForm has errors");
			for (ObjectError err : _res.getAllErrors()) {
				logger.error("CommentForm error : " + err);
			}
			return model;
		}
		
		int score = _commentForm.getScore();
		String comment = _commentForm.getComment();
		DroidzManager.getInstance().addComment(_droidId, score, comment);
		
		return model;
	}
}
