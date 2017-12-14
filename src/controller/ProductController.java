package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Product;

@Controller
public class ProductController {
	@RequestMapping("/addProduct")
	public ModelAndView add(Product product,HttpServletRequest request,HttpServletRequest response){
		ModelAndView mav = new ModelAndView("showProduct");
		return mav;
	}
	
	
}
