package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductJPARepository;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
	private ProductJPARepository productJPARepository;
	@Override
	public List<Product> getProducts() {
		return productJPARepository.findAll();
	}
}
