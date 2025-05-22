package com.ecom.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data
public class ProductQuery {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	    private Long productId;
	    private String name;
	    private String email;
	    @Lob
	    private String query;
}
