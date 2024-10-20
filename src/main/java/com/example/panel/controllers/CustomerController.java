package com.example.panel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/prueba")
    public String prueba() {
        return "Hola mundo";
    }
}
