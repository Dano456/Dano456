package com.example.kniznica;

import java.util.List;

import com.example.kniznica.entities.books;
import com.example.kniznica.services.booksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("api/")
public class Controller {
    
     @Autowired
     private booksService booksService;
     /** 
     @RequestMapping("creator")

     public String hello() {
 
         return "Môj zhotoviteľ je Daar :-) ";
 
    }
    */

    @GetMapping("getbooks")

    public List<books> getAllBook() {

         return booksService.getAllBooks();
 
    }
/** 
    @GetMapping("getbooks/{id}")

    public books getBook(@PathVariable Integer id) {

         return booksService.getBook(id);
 
    }
*/
    @PostMapping("addbook")
    public books saveBooks(@RequestBody books books) {
          return booksService.saveBooks(books);
         
    }

    @RequestMapping(method = RequestMethod.PUT, value="addbooks/{id}")

    public void updateBooks(@PathVariable Long id, @RequestBody books books) {
      booksService.updateBooks(id,books);
          
    }

    @RequestMapping("**")

    public String nothing() {

          return "You have entered an incorrect URL !!!";
    }
 
}

    

