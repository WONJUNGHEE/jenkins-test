package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String hello(){
        Calc calc = new Calc();
        long result = calc.add(10,20);
        return "Welcome o simple Ecommerce var 1.0 10+20= "+result;
    }
}