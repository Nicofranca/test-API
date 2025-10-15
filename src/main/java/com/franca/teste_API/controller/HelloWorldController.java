package com.franca.teste_API.controller;

import com.franca.teste_API.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-api")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;


    @GetMapping
    public String print(){
        return helloWorldService.helloWord("França");
    }
}
