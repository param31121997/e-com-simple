package com.ecom.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entities.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	List<Product> findAll();
	
}
