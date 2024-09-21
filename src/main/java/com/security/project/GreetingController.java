package com.security.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class GreetingController {
    @GetMapping("/home")
    public String Greeting(){
        return "Hello Srikanth!";
    }

}
