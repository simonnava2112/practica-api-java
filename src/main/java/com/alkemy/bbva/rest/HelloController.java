package com.alkemy.bbva.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloWorld helloWorld;

    public HelloController(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @GetMapping("/")
    public String helloWorld(){
           return helloWorld.sayHi();
    }

    @GetMapping("/iara")
    public String helloIara(){
        return "Hello World!";
    }


    @PostMapping("/post")
    public String helloPost(){
        return "Hello World!";
    }

}
