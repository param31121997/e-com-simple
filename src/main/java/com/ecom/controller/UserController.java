package com.ecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.entities.Product;
import com.ecom.entities.ProductQuery;
import com.ecom.entities.User;
import com.ecom.service.ProductQueryService;
import com.ecom.service.ProductService;
import com.ecom.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductQueryService productQueryService;

	
	@PostMapping("/registerNewUser")
	public ResponseEntity<?>  registerNewUser(@RequestBody User user) {
		return userService.registerNewUser(user);
	}
		
	
	@GetMapping("/getAllProducts")
	public List<Product> getProducts() {
        return productService.findAllProducts();
    }
	
	@PostMapping("/user/submitProductQuery")
	public ResponseEntity<?> handleQuery(@RequestBody ProductQuery query) {
		productQueryService.saveProductQuery(query);
	    return ResponseEntity.ok().body("Query submitted");
	}
	
}
