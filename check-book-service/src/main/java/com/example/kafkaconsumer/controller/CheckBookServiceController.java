package com.example.kafkaconsumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckBookServiceController {
    @Value("${message}")
    private String message;

    @GetMapping("/getRemoteField")
    public String getRemoteField() {
        return message;
    }
}
