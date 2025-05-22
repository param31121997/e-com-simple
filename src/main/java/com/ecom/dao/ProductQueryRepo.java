package com.ecom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entities.ProductQuery;

@Repository
public interface ProductQueryRepo extends JpaRepository<ProductQuery, Long>{
	
	List<ProductQuery> findAll();

}
