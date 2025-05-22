package com.ecom.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController {

    @GetMapping("/redirectByRole")
    public String redirectByRole(Authentication authentication) {
        if (authentication.getAuthorities().stream().anyMatch(auth -> auth.getAuthority().equals("ROLE_Admin"))) {
            return "redirect:/admin.html";
        } else {
            return "redirect:/user.html";
        }
    }
}