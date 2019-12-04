# introduction
Official Site : Spring.io
Pivotal is the company.

# what is spring?
<spring
open source framework
based on java platform
helps build desktop, web applications, web services, cloud based applications
spring boot is the latest release
developed by Pivotal>

<spring features
interface driven development
pojo based
loose coupling
unobtrusive>

<modules in spring
core = Dependency Injection and Inversion of Control
web
web mvc
aop (aspect oriented programming)
jdbc
security
cloud>

# TASK 1 : set up an enterprise application with layered architecture & maven.
## maven
<build tool>
<manages dependencies>
<pom (project object model - xml file containing the dependencies)>

# step1 : create a maven console app
1. New Maven project
2. Skip Archetype
3. group id : com.demo
4. artifact id : l01-enterprise-application-bootstrap

# step 2 : configure pom.xml [jdk config , spring config]
1. 	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.2</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
		</plugins>
	</build>

2. <dependencies>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>4.3.2.RELEASE</version>
		</dependency>
	</dependencies>










# step 3 : create the model, repository, service, application layers
1. create the model
package com.domain.model;
public class Product {
	private String productId;
	private String productName;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName
				+ "]";
	}
}

2. create the repository
package com.domain.model;
import java.util.List;
public interface ProductRepository {
List<Product> getProducts();
}

package com.domain.repository;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;

public class MongoDBRepository implements ProductRepository{

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		Product technology = new Product();
		technology.setProductId("P01");
		technology.setProductName("Master Spring");
		products.add(technology);
		technology = new Product();
		technology.setProductId("P02");
		technology.setProductName("Master Hibernate");
		return products;
	}

}

package com.domain.repository;

import java.util.List;

import com.domain.model.Product;

public class PostgreSQLRepository implements ProductRepository{

	@Override
	public List<Product> getProducts() {
		//to be implemented in future
		return null;
	}

}

3. CREATE THE SERVICE
package com.domain.service;

import java.util.List;

import com.domain.model.Product;

public interface ProductService {
List<Product> getProducts();
}
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

4. CREATE THE APPLICATION AND CONSUME THE SERVICE
package com.domain;

import java.util.ArrayList;
import java.util.List;

import com.domain.model.Product;
import com.domain.service.ProductService;
import com.domain.service.ProductServiceImpl;

public class Application {
	public static void main(String[] args) {
		ProductService productService = new ProductServiceImpl();
		List<Product> products = productService.getProducts();
		// java 8 forEach Lambda Expression
		// forEach(Consumer)
		// java.util.function : new package with functional interfaces.
		products.forEach(product -> System.out.println(product));
		//shorthand syntax
		products.forEach(System.out::println);
	}
}


