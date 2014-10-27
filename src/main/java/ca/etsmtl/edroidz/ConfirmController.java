package ca.etsmtl.edroidz;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ConfirmController{

	@RequestMapping(value = "/confimation", method = RequestMethod.GET)
	public ModelAndView Confirm(HttpServletRequest _req) {
		
		ModelAndView model = new ModelAndView("Confirmation");		
		return model;
	}
}
