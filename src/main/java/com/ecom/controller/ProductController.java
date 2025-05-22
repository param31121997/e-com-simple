package com.ecom.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.entities.Product;
import com.ecom.entities.ProductQuery;
import com.ecom.service.ProductQueryService;
import com.ecom.service.ProductService;

@RestController
@RequestMapping("/admin")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductQueryService productQueryService;

	@PostMapping("/addNewProduct")
	public Product addNewProduct(@RequestBody Product product) {
		try {
			return productService.addNewProduct(product);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product product) {
		try {
			return productService.addNewProduct(product);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	@DeleteMapping("/deleteProductDetails/{productId}")
	public void deleteProductDetails(@PathVariable("productId") Integer producId) {
		 productService.deleteProductDetails(producId);
	}
	
	
	@GetMapping("/getProductDetailsById/{productId}")
	public Optional<Product> getProducDetailsById(@PathVariable("productId") Integer productId) {
		return this.productService.getProducDetailsById(productId);
	}
	
	@GetMapping(value="/getAllProducts")
	public List<Product> getProducts() {
        return productService.findAllProducts();
    }
	
	@GetMapping("/getAllProductQuery")
	public List<ProductQuery> getAllProductQuery() {
		return productQueryService.getAllProductQuery();
    }

}
