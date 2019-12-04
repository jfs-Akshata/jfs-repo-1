package com.domain.service;

import java.util.List;

import com.domain.model.Product;
import com.domain.repository.MongoDBRepository;
import com.domain.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
  private ProductRepository productRepository = new MongoDBRepository(); 
	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}

}
