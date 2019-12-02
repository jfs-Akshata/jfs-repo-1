package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class PostgreSQLRepository implements ProductRepository{

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product technology = new Product();
		technology.setProductId("P01");
		technology.setProductName("Spring");
		products.add(technology);
		technology = new Product();
		technology.setProductId("P02");
		technology.setProductName("Hibernate");
		return products;
	}

}
