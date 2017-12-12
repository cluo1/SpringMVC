package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		//ModelAndView mv = new ModelAndView("index.jsp");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "HelloMVC");
		return mv;
	}

}
