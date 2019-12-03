# recap
1. xml config (applicationContext.xml)
2. annoation config (applicationContext.xml + annotations)
@Component, @Controller, @Repository, @Service
@Autowired
3. java config( no applicationContext.xml)
@Bean

# TASK : IMPLEMENT JAVA CONFIG WITH @BEAN
## analyze code
1. eliminate applicationContext.xml
2. Create AppConfig.class & define Beans with @Bean (Note: No Stereotypes used inside code)
    <!-- ClassPathXmlApplicationContext
	<bean name="productRepository"
		class="com.domain.repository.MongoDBRepository">
	</bean>

    ApplicationContext appContext = new AnnotationConfigApplicationContext(
				AppConfig.class);
                 -->
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
		return null;
	}

	@Bean(name = "productRepository")
	public ProductRepository getProductRepository() {
		return new MongoDBRepository();
	}
}
4. configure the client app to use AppConfig.class
package com.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
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

# TASK : IMPLEMENT JAVA CONFIG WITH AUTOWIRING
1. use @Configuration
2. use 