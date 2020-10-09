package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${enviromentName}")
    private String enviromentName;

    @GetMapping("/hello")
    public String hello() {
        return "hello!"+ enviromentName;
    }
}
