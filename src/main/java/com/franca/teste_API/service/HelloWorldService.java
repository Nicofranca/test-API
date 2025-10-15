package com.franca.teste_API.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {


    public String helloWord(String name){
        return "Hello Word, "+name;
    }
}
