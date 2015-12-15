package com.packt.webstore.validator;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CategoryValidator implements ConstraintValidator<Category, String> {

	List<String> allowedCategories = new ArrayList<String>();

	public CategoryValidator() {
		super();
		// TODO Auto-generated constructor stub
		allowedCategories.add("Smart Phone");
		allowedCategories.add("Laptop");
		allowedCategories.add("Tablet");
	}

	public void initialize(Category category) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String value, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		for (String string : allowedCategories) {
			if (string.equalsIgnoreCase(value)) {
				return true;
			}
		}
		return false;
	}

}
