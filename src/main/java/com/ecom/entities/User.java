
package com.ecom.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Entity
@Data
public class User {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long useId;
    private String userName;
    private String userFirstName;
    private String userLastName;
    private String userPassword;
    private String role;
}
