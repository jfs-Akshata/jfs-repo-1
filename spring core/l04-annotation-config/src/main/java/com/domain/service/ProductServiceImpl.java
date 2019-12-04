package com.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.model.Product;
import com.domain.repository.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {
	//Field based injection
	//@Autowired
	private ProductRepository productRepository;
	//Constructor based injection
	@Autowired
	public  ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("Constructor Injection : ProductServiceImpl");
		this.productRepository = productRepository;
	}
	//Setter based injection
	//@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("Setter Injection : ProductServiceImpl");
		this.productRepository = productRepository;
	}
	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}
