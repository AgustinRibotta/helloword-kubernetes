package com.helloword.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/")
public class controllers {

    @GetMapping()
    public String hello() {
        return new String("Hello, It the Spring Boot project");
    }
    
    @GetMapping("/hello")
    public String helloaname() {
        return new String("Hello, Agustin");
    }


}
