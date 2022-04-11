package com.example.kniznica;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class Controller {
    
    @RequestMapping("/hello")

    public String hello() {
 
         return"Ahoooooj!";
 
    }
 
 @RequestMapping("/book")
 
    public Book getBook() {
 
      return new Book("Duna", "Frank Herbert", 523, true);
 
    }
    
}
