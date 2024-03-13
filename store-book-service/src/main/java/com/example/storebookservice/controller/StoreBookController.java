package com.example.storebookservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreBookController {
    @Value("${message}")
    private String message;

    @GetMapping("/getRemoteField")
    public String getMessage() {
        return message;
    }
}
