package com.ecom.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(length = 1000)
	private String productName;
	
	@Column(length = 1000)
	private String productDescription;
	
	private Double productDiscountPrice;
	
	private Double productActualPrice;
	

}
