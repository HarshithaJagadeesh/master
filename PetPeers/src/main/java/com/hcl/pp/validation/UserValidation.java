package com.hcl.pp.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hcl.pp.model.User;

@Component
public class UserValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return User.class.equals(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "nomatch.userName", "Username can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPassword", "nomatch.password", "Password can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "nomatch.confirm", "Field can't be empty");
		
		User user = (User)target;
		
		if(!(user.getUserPassword().equals(user.getConfirmPassword()))){
			errors.rejectValue("confirmPassword", "notmatch.password","Passwod dont match");
			
		}	
		
	}

}
