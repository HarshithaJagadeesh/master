package com.hcl.pp.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.pp.model.Pet;
import com.hcl.pp.model.User;
import com.hcl.pp.service.SecurityService;
import com.hcl.pp.service.UserService;
import com.hcl.pp.validation.LoginValidation;
import com.hcl.pp.validation.PetValidation;
import com.hcl.pp.validation.UserValidation;

@Controller
//@RequestMapping("/")
public class PetsAppController {

	@Autowired
	private User user;
	
	@Autowired
	private Pet pet;
	
	@Autowired
	private UserService userService;

	@Autowired
	private SecurityService securityService;


	@InitBinder("user")
	protected void InitRegBinder(WebDataBinder binder) {
		System.out.println("init");
		binder.addValidators(new UserValidation());
	}

	@InitBinder("loginUser")
	protected void InitLoginBinder(WebDataBinder binder) {
		binder.addValidators(new LoginValidation());
	}
	
	@InitBinder("pet")
	protected void InitPetBinder(WebDataBinder binder) {
		System.out.println("init");
		binder.addValidators(new PetValidation());
	}

	@RequestMapping(value="/user/registration")
	public String firstPage(Model model)
	{
		model.addAttribute("user",user);
		return "userregn";
	}
	
	@RequestMapping(value="/user/add")
	public String addUser(@ModelAttribute("user") @Validated User user, BindingResult result,Model model) 
	{
		if(result.hasErrors())
		{
			return "userregn";
		}
		else 
		{
			user = userService.addUser(user);
			if (user == null) {
				result.rejectValue("username", "error.taken", "Username already taken");
				return "userregn";
			}
			return "registered";
			 
		}
	}
	
	@RequestMapping(value="/user/logout")
	public String logout(Model model)
	{
		System.out.println("Controller .. logout ");
		model.addAttribute("loginUser",user);
		return "login";
	}
	
	@GetMapping(value = "user/login")
	public String userLogin(Model model) {
		model.addAttribute("loginUser", user);
		return "login";
	}
	
	@RequestMapping(value="/user/authenticate")
	public String authenticateUser(@ModelAttribute("loginUser") @Validated User user, BindingResult result, Model model)
	{
		System.out.println("Controller .. home ");
		if(result.hasErrors())
		{
		
			return "login";
		}
		else 
		{
			Boolean isAuthenticateUser;
			isAuthenticateUser = securityService.authenticateUser(user);
			if(isAuthenticateUser==false) {
				result.rejectValue("userPassword", "error.userPassword", "Username and Password don't match");
				return "login";
			}
			return "redirect:/pets";
		}
	}
	
	
	@RequestMapping(value="/pets")
	public String petHome()
	{
		return "pet_home";
	}
	
	@RequestMapping(value="/pets/myPets")
	public String myPets()
	{
		System.out.println("Controller .. myPets ");
		return "my_pets";
	}
	
	@RequestMapping(value="/pets/petDetail")
	public String petDetail(Model model)
	{
		System.out.println("Controller .. petsDetail ");
		model.addAttribute("pet", pet);
		return "pet_form";
	}
	
	@RequestMapping(value="/pets/addPet")
	public String addPet(@ModelAttribute @Validated Pet pet, BindingResult result, Model model)
	{
		if(result.hasErrors()) {
			return "pet_form";
		}else {
		System.out.println("Controller .. savePet ");
		return "redirect:/pets";
		}
	}
	
	@RequestMapping(value="/pets/buyPet/{petId}")
	public String buyPet()
	{
		System.out.println("Controller .. buyPet ");
		return "redirect:/pets";
	}
	
}
