package com.example.kniznica;

import java.util.List;
import com.example.kniznica.entities.books;
import com.example.kniznica.repositories.bookRepository;
import com.example.kniznica.services.booksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("api/")
@CrossOrigin
public class Controller {
    
     @Autowired
     booksService booksService;

     @Autowired
     bookRepository bookRepository;

    @GetMapping("getbooks")

    public List<books> getAllBook() {

         return booksService.getAllBooks();
 
    }
 
    @GetMapping("getbooks/{id}")

    public books getBook(@PathVariable Long id) {

         return booksService.getBook(id);
 
    }

    @PostMapping("addbook")
    public void saveBooks(@RequestBody books books) {
           booksService.saveBooks(books);
         
    }

    @RequestMapping(method = RequestMethod.PUT, value="addbooks/{id}")

    public void updateBooks(@PathVariable Long id, @RequestBody books books) {
      booksService.updateBooks(id,books);
          
    }

    @DeleteMapping(value = "deletebook/{id}")

    public void deleteBooks(@PathVariable Long id) {
      booksService.deleteBooks(id);
          
    }

    @RequestMapping("**")

    public String nothing() {

          return "You have entered an incorrect URL !!!";
    }
 
}

    

