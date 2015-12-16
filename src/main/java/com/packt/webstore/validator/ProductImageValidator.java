package com.packt.webstore.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.packt.webstore.domain.Product;

public class ProductImageValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Product product = (Product) target;
		if (product.getProductImage() != null
				&& new Long(10000).compareTo(product.getProductImage()
						.getSize()) < 0) {
			errors.rejectValue("productImage",
					"com.packt.webstore.validator.ProductImageValidator.message");
		}
	}

}
