package com.example.kniznica.services;

import java.util.List;
import com.example.kniznica.entities.books;
import com.example.kniznica.repositories.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class booksService {

   @Autowired bookRepository bookRepository;

   public booksService(){

   }

   public List<books> getBooks(){

      return bookRepository.findAll();

   }

   public books saveBooks(books books) {

      return bookRepository.save(books);

   }
    
}
