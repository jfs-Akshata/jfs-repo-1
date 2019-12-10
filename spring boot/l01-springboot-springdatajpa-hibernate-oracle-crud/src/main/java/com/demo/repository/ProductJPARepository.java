package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Product;
@Repository
public interface ProductJPARepository extends JpaRepository<Product, Integer>{
//CRUD operations inplemented by spring auto-magically
}
