package com.niit.shoppingcart.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDao;
import com.niit.shoppingcart.dao.UserDao;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

@Controller
public class HomeController 
{
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	Category category;
	
	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getLoad(Model model){
		System.out.println("on load");
		model.addAttribute("category", category);
		//model.addAttribute("categoryList",this.categoryDao.list());
		return "index";
	
}
	@RequestMapping(value = "/onLoad", method = RequestMethod.GET)
	public String onLoad(Model model){
		System.out.println("on load");
		model.addAttribute("category", category);
		//model.addAttribute("categoryList",this.categoryDao.list());
		return "index";
	
}
	
	@RequestMapping("/register")
	public ModelAndView getRegister(Model m,@RequestParam(value="error",required=false)String error)
	{
		m.addAttribute("user",new User());
		ModelAndView model=new ModelAndView("signUp");
				
	    return model;
	}
	
	@RequestMapping(value="register/add",method=RequestMethod.POST)
	public String addUser(Model model, @Valid @ModelAttribute("user") User user)
	{
		//user.setRole("ROLE_USER");
		
		userDao.addUser(user);
		ModelAndView mv=new ModelAndView("/");
		mv.addObject("success","data updated sucessfully");
		return "redirect:/";
		
	}
	

	@RequestMapping(value="/user")
	public String getUser()
	{
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String  login(@RequestParam(value="error",required=false)String error,@RequestParam(value="logout",required=false) String logout,Model model)
	{
		if(error!=null)
		{
			System.out.println("Error..");
			model.addAttribute("loginerror","...Invalid username and password");
		}
		
		if(logout!=null)
		{
			System.out.println("logout called..");
			model.addAttribute("loginmsg","...you have been logged out");
		}
		
		return "login";
	}
	
    @RequestMapping(value="/admin")
    public String getAdmin()
    {
    	return "adminHome";
    }
	
    @RequestMapping(value="/aboutUs")
    public String about()
    {
    	return "aboutUs";
    }
    
    @RequestMapping(value="/productList")
    public String getProductList()
    {
    	return "productList";
    }
	
}
