package com.sample.first.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testApi")
    public String testApi(){
        return "this is a test api";
    }
}
