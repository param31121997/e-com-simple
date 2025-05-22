package com.ecom.dao;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}