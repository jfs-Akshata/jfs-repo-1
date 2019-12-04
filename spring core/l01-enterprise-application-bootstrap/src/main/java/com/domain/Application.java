package com.domain;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class Application {
	public static void main(String[] args) {
		ProductService productService = new ProductServiceImpl();
		List<Product> products = productService.getProducts();
		// java 8 forEach Lambda Expression
		// forEach(Consumer)
		// java.util.function : new package with functional interfaces.
		products.forEach(product -> System.out.println(product));
		//shorthand syntax
		products.forEach(System.out::println);
	}
}
