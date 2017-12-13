package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController{
	@RequestMapping("/index")
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		//ModelAndView mv = new ModelAndView("index.jsp");
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "HelloMVC");
		return mv;
	}

}
