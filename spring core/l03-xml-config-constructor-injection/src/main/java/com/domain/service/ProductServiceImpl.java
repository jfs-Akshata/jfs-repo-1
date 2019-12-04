package com.domain.service;

import java.util.List;

import com.domain.model.Product;
import com.domain.repository.MongoDBRepository;
import com.domain.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	//Eliminate the hard coding
  //private ProductRepository productRepository = new MongoDBRepository(); 
	private ProductRepository productRepository;
	//Constructor based injection
	public  ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("Constructor Injection : ProductServiceImpl");
		this.productRepository = productRepository;
	}
	//Setter based injection
//	public void setProductRepository(ProductRepository productRepository) {
//		System.out.println("Setter Injection : ProductServiceImpl");
//		this.productRepository = productRepository;
//	}
	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}
