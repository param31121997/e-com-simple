package com.ecom.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecom.dao.ProductRepository;
import com.ecom.entities.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public Product addNewProduct(Product product) {
		return productRepository.save(product);
	}
	
	public Product updateProduct(Product updatedProduct) {
	Product product =	productRepository.findById(updatedProduct.getId()).get();
	product.setProductName(updatedProduct.getProductName());
	product.setProductDescription(updatedProduct.getProductDescription());
	product.setProductActualPrice(updatedProduct.getProductActualPrice());
	product.setProductDiscountPrice(updatedProduct.getProductDiscountPrice());
	return productRepository.save(product);
	}
	

    public List<Product> findAllProducts() {		
			 return productRepository.findAll();
	}
	       	 
	public void deleteProductDetails(Integer productId) {
		// TODO Auto-generated method stub
		 productRepository.deleteById(productId);;
	}
	
	public Optional<Product> getProducDetailsById(Integer productId) {
		return this.productRepository.findById(productId);
	}
}
