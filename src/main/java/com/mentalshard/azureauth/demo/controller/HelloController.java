package com.mentalshard.azureauth.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello/{name}")
    public String hello(@PathVariable String name){
        return "Hello " + name;
    }

    @GetMapping("/api/hello")
    public String hello2(){
        return "Hello people";;
    }
}
