package com.helloword.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/")
public class controllers {

    @GetMapping()
    public String hello() {
        return new String("Hi");
    }
    
    @GetMapping("/hello")
    public String helloaname() {
        return new String("Hello, Agustin");
    }

    @GetMapping("/bye")
    public String helloanames() {
        return new String("Bye, Agustin");
    }

    @GetMapping("/logro")
    public String logro () {
        return new String ("Lo logramos");
    }

}
