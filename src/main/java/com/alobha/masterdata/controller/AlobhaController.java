package com.alobha.masterdata.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlobhaController {

	@RequestMapping("/")
    public String homePage() {       
        return "Hello world";
    }
}
