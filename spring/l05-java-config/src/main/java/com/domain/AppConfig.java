package com.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domain.repository.MongoDBRepository;
import com.domain.repository.ProductRepository;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

//@Configuration
public class AppConfig {
	@Bean(name = "productService")
	public ProductService getProductService() {
		//constructor injection
		ProductService productService = new ProductServiceImpl(getProductRepository());
		return productService;
	}

	@Bean(name = "productRepository")
	public ProductRepository getProductRepository() {
		return new MongoDBRepository();
	}
}
