package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class greeting {

    @GetMapping("/greet")
    public String hello(@RequestParam("name") String name) {
        return "Hello"+name;
    }

    public static void main(String[]args){
        SpringApplication.run(greeting.class,args);
        }
}
