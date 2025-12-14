package com.social.instagram.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {
    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Backend is running successfully");
    }
}
