package be.vdab.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
	private static final String VIEW = "index";
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView index(){
		return new ModelAndView(VIEW).addObject("welcome", "welkom hier op deze pagina");
	}
}
