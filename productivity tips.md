# VS CODE extensions : Markdown All in One

**SpringBoot**

# Full Stack
## Spring
### Spring Core
#### XML config
##### Dependency Injection
###### Setter Based
#### Java config
### Spring MVC
## Angular

**Steps for Spring Project**
- Crete the project
- configure the controller

``` java
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
```

``` xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:mvc="http://www.springframework.org/schema/mvc"
	xsi:schemaLocation="http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc-4.3.xsd
		http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
		http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context-4.3.xsd">
	<!-- configure component scanning -->
	<context:component-scan
		base-package="com.mvc" />

	<!-- configure mvc support with annotations -->
	<mvc:annotation-driven />
	<!-- configure the view resolver -->
	<bean
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/view/" />
		<property name="suffix" value=".jsp"></property>
	</bean>
</beans>

```

~~ don't use this code~~

1. learn
   1. listen
   2. take notes
2. apply

[search](https://www.google.com)

The main component of spring is `dependency injection`


| Topic | Summary |
|------ |---------|
|Core|Bean Factory is primarily used in spring
|MVC| Dispatcher Servlet is the primary component.

> Note : Create a live doucumentation on GitHub




The above is a note.
``` html
<dl>
  <dt>Definition list</dt>
  <dd>Is something people use sometimes.</dd>

  <dt>Markdown in HTML</dt>
  <dd>Does *not* work **very** well. Use HTML <em>tags</em>.</dd>
</dl>
```
---
***
___