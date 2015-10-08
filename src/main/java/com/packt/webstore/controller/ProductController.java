package com.packt.webstore.controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pact.webstore.domain.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/products")
	public String list(Model model) {
		Product iphone = new Product("P1234", "iphone 5s", new BigDecimal(500));
		iphone.setDescription("Apple Iphone smart phone");
		iphone.setCategory("Smart phone");
		iphone.setManufacturer("Apple");
		iphone.setUnitsInStock(1000);
		
		model.addAttribute("product", iphone);
		
		return "products";
	}
}
