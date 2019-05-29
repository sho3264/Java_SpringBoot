package sho.homeinsurance.controller;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sho.homeinsurance.service.HomeownersBusinessService;
import sho.homeinsurance.service.LocationsBusinessService;
import sho.homeinsurance.service.PropertiesBusinessService;
import sho.homeinsurance.service.UsersBusinessService;
import sho.homeinsurance.table.Users;

@RestController
public class HomeController implements ErrorController{
	// Need to implement ErrorController for SpringBoot not to use 
	// basicErrorController
	
	
	
	@Autowired
	private UsersBusinessService usersService;
	@Autowired
	private HomeownersBusinessService homeownersService;
	@Autowired 
	private LocationsBusinessService locationsService;
	@Autowired
	private PropertiesBusinessService propertiesService;
	
	private List<String> errorList;

	

	@RequestMapping({"LoginPage","/"})
	public ModelAndView showLoginPage()
	{
		return new ModelAndView("LoginPage");
	}

	@RequestMapping(value="LoginUser", method= RequestMethod.POST)
	public ModelAndView loginUser(@RequestParam("username")String username,
			@RequestParam("password")String password,HttpSession session, 
			RedirectAttributes redirectAttribute)
	{
		ModelAndView mav = null;
		Users user = usersService.getUserByUserName(username);
		// Check if name shows up in database
		// The IF statement will return false if the username is not in the database
		if(user!=null)
		{
			// Check if the password matches the username
			if (password.contentEquals(user.getPassword()))
			{
				mav = new ModelAndView("redirect:GetStarted");
				session.setAttribute("uname", user);
				return mav;
			}
			// Password does not match username
			else
			{
				errorList = new ArrayList<String>();
				errorList.add("Password does not match Username");
				mav = new ModelAndView("redirect:LoginPage");
				redirectAttribute.addFlashAttribute("errorList", errorList);
				return mav;
			}
		}

		// Username is not in the database
		else
		{
			errorList= new ArrayList<String>();
			errorList.add("Invalid User");
			mav = new ModelAndView();
			mav.setViewName("redirect:LoginPage");
			redirectAttribute.addFlashAttribute("errorList", errorList);
			return mav;

		}

	}

	@RequestMapping("RegisterPage")
	public ModelAndView showRegisterUserPage()
	{
		return new ModelAndView("RegisterPage");
	}
	
	@RequestMapping(value="addUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("username")String username,
			@RequestParam("password")String password)
	{
		Users u = new Users(username,password);
		usersService.addUsers(u);
		return new ModelAndView("redirect:LoginPage");
	}
	
	@RequestMapping("AdminPage")
	public ModelAndView showAdminLoginPage()
	{
		return new ModelAndView("AdminPage");
	}
	
	@RequestMapping("/error")
	public String error()
	{
		return "Error Page";
	}
	
	// Change error path
	@Override
	public String getErrorPath()
	{
		return "/error";
	}
	



}
