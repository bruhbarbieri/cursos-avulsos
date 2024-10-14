package com.bruna.first_spring_app.controller;

import com.bruna.first_spring_app.domain.User;
import com.bruna.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWordController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld() {
        return "Hello Word!";
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id, @RequestBody User body) {
        return "Hello World " + id;
    }
}
