package com.example.kniznica;

import java.util.List;
import com.example.kniznica.entities.books;
import com.example.kniznica.services.booksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/")
public class Controller {
    
     @Autowired
     private booksService booksService;

    @GetMapping("getbooks")

    public List<books> getAllBook() {

         return booksService.getAllBooks();
 
    }
 
    @GetMapping("getbooks/{id}")

    public books getBook(@PathVariable Long id) {

         return booksService.getBook(id);
 
    }

    @PostMapping("addbook")
    public books saveBooks(@RequestBody books books) {
          return booksService.saveBooks(books);
         
    }

    @RequestMapping(method = RequestMethod.PUT, value="addbooks/{id}")

    public void updateBooks(@PathVariable Long id, @RequestBody books books) {
      booksService.updateBooks(id,books);
          
    }

    @DeleteMapping(value = "/api/deletebook/{id}")

    public void deleteBooks(@PathVariable Long id) {
      booksService.deleteBooks(id);
          
    }

    @RequestMapping("**")

    public String nothing() {

          return "You have entered an incorrect URL !!!";
    }
 
}

    

