package com.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.dao.ProductQueryRepo;
import com.ecom.entities.ProductQuery;

@Service
public class ProductQueryService {

	@Autowired
	ProductQueryRepo  productQueryRepo;
	
	public void saveProductQuery(ProductQuery productQuery) {
		productQueryRepo.save(productQuery);
	}
	
	public List<ProductQuery> getAllProductQuery() {
		return productQueryRepo.findAll();
	}
}
