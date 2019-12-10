package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
    @RequestMapping("/products")
	//@GetMapping("/products")(
	List<Product> getProducts() {
		return productService.getProducts();
	}
}
