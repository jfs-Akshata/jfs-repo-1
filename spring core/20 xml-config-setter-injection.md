# TASK : IMPLEMENT SETTER BASED INJECTION
# step 1 : configure the project to use spring using maven dependencies
1. <dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>4.3.2.RELEASE</version>
		</dependency>
	</dependencies>
# step 2 : configure spring beans in .xml file for setter based dependency injection
1. create 02-xml-config-setter-injection\src\main\resources\applicationContext.xml
	<!-- ProductRepository productRepository = new MongoDBRepository();  -->
	<bean name="productRepository"
		class="com.domain.repository.MongoDBRepository">
	</bean>
	<!-- ProductService productService = new ProductServiceImpl(); -->
	<bean name="productService"
	class="com.domain.service.ProductServiceImpl">
<!-- 		public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	} -->
	<property name="productRepository" ref="productRepository"></property>
	</bean>
# step 3 : modify the code to remove hard coded instances and inject dependencies

package com.domain.service;

import java.util.List;

import com.domain.model.Product;
import com.domain.repository.MongoDBRepository;
import com.domain.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	//Eliminate the hard coding
  //private ProductRepository productRepository = new MongoDBRepository(); 
	
	private ProductRepository productRepository = null;
	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("Setter Injection : setProductRepository(ProductRepository productRepository)");
		this.productRepository = productRepository;
	}
	@Override
	public List<Product> getProducts() {
		return productRepository.getProducts();
	}
}

# step 4 : Load Spring Context and access the beans
package com.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.model.Product;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class Application {
	public static void main(String[] args) {
		// standardCode();
		compactCode();
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
