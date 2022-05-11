package com.example.kniznica;

import java.util.List;

import com.example.kniznica.entities.books;
import com.example.kniznica.services.booksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class Controller {
    
     @Autowired
     booksService booksService;
     @RequestMapping("hello")

     public String hello() {
 
         return"Ahoooooj!";
 
    }
    
    @GetMapping("getbooks")

    public List<books> getBook() {

         return booksService.getBooks();
 
    }
 
}

    

