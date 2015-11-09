package com.packt.webstore.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.packt.webstore.domain.Product;
import com.packt.webstore.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping
	public String list(Model model) {

		model.addAttribute("products", productService.getAllProducts());

		return "products";
	}

	@RequestMapping("/all")
	public String allProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}

	@RequestMapping("/{category}")
	public String getProductsByCategory(Model model,
			@PathVariable("category") String productCategory) {
		model.addAttribute("products",
				productService.getProductsByCategory(productCategory));
		return "products";
	}

	@RequestMapping("filter/{ByCriteria}")
	public String getProductsByFilter(
			@MatrixVariable(pathVar = "ByCriteria") Map<String, List<String>> filterParams,
			Model model) {
		model.addAttribute("products",
				productService.getProductsByFilter(filterParams));
		return "products";
	}

	@RequestMapping("/product")
	public String getProductById(@RequestParam("id") String productId,
			Model model) {
		model.addAttribute("product", productService.getProductById(productId));
		return "product";
	}

	@RequestMapping("/{category}/{price}")
	public String filterProducts(
			Model model,
			@PathVariable("category") String productCategory,
			@RequestParam("manufacturer") String productManufacturer,
			@MatrixVariable(pathVar = "price") Map<String, List<String>> filterParams) {

		List<Product> productsByCategory = productService
				.getProductsByCategory(productCategory);
		Set<Product> productsByFilter = productService
				.getProductsByPriceFilter(filterParams);
		List<Product> productsByManufacturer = productService
				.getProductsByManufacturer(productManufacturer);

		Set<Product> result = new HashSet<Product>();
		for (Product product : productsByCategory) {
			result.add(product);
		}

		for (Product product : productsByFilter) {
			result.add(product);
		}

		for (Product product : productsByManufacturer) {
			result.add(product);
		}

		model.addAttribute("products", result);

		return "products";
	}
	
	@RequestMapping("filter1/{price}")
	public String getProductsByPriceFilter(
			@MatrixVariable(pathVar = "price") Map<String, List<String>> filterParams,
			Model model) {
		model.addAttribute("products",
				productService.getProductsByPriceFilter(filterParams));
		return "products";
	}

}
