package com.example.kniznica;

import java.util.List;

import com.example.kniznica.entities.books;
import com.example.kniznica.services.booksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/")
public class Controller {
    
     @Autowired
     booksService booksService;
     /** 
     @RequestMapping("creator")

     public String hello() {
 
         return "Môj zhotoviteľ je Daar :-) ";
 
    }
    */

    @GetMapping("getbooks")

    public List<books> getBook() {

         return booksService.getBooks();
 
    }

    @PostMapping("addbook")
    public books saveBooks(@RequestBody books books) {
          return booksService.saveBooks(books);
         
    }

    @RequestMapping("**")

    public String nothing() {

          return "You have entered an incorrect URL !!!";
    }
 
}

    

