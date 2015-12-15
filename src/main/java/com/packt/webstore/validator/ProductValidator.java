package com.packt.webstore.validator;

import java.util.HashSet;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.packt.webstore.domain.Product;

public class ProductValidator implements Validator {

	@Autowired
	private javax.validation.Validator beanValidator;

	private Set<Validator> springValidators;

	public ProductValidator() {
		springValidators = new HashSet<Validator>();
	}

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Set<ConstraintViolation<Object>> constraintViolations = beanValidator
				.validate(target);
		for (ConstraintViolation<Object> constraintViolation : constraintViolations) {
			String propertyPath = constraintViolation.getPropertyPath()
					.toString();
			String message = constraintViolation.getMessage();
			errors.rejectValue(propertyPath, "", message);
		}

		for (Validator validator : springValidators) {
			validator.validate(target, errors);
		}
	}

	public Set<Validator> getSpringValidators() {
		return springValidators;
	}

	public void setSpringValidators(Set<Validator> springValidators) {
		this.springValidators = springValidators;
	}

}
