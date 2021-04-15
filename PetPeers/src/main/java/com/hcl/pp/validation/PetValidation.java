package com.hcl.pp.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hcl.pp.model.Pet;

public class PetValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return Pet.class.equals(arg0);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "empty.id", "Pet ID can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "empty.name", "Pet name can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "empty.age", "Pet age can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "place", "empty.place", "Pet place can't be empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "owner", "empty.owner", "Pet owner can't be empty");
		
	}

}
