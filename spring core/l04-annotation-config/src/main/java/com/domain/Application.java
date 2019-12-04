package com.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.model.Product;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class Application {
	public static void main(String[] args) {
		standardCode();
		//compactCode();
	}

	private static void standardCode() {
		// Remove hard coded instance
		// ProductService productService = new ProductServiceImpl();

		// Load the Spring IOC Container
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// ProductService productService =
		// (ProductService)applicationContext.getBean("productService");

		// the second parameter reduces the burden of type casting.
		ProductService productService = applicationContext.getBean("productService",
				ProductService.class);
		List<Product> products = productService.getProducts();

		// java 8 forEach Lambda Expression
		// forEach(Consumer)
		// java.util.function : new package with functional interfaces.
		// products.forEach(product -> System.out.println(product));
		// shorthand syntax

		products.forEach(System.out::println);
	}

	public static void compactCode() {
		new ClassPathXmlApplicationContext("applicationContext.xml")
				.getBean("productService", ProductService.class).getProducts()
				.forEach(System.out::println);
	}
}
