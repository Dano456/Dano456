package com.example.kniznica.services;

import java.util.List;

import com.example.kniznica.entities.books;
import com.example.kniznica.repositories.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class booksService {

   @Autowired 
   bookRepository bookRepository;

   public booksService(){

   }

   public List<books> getAllBooks(){

      return bookRepository.findAll();

   }
 
   public books getBook(Long id){

      return bookRepository.getById(id);

   }
   
   public void saveBook(books books) {
/**
 * saveBook - 
 * (Book book)
 */
       bookRepository.save(books);

   }

   public void updateBooks(Long id, books books) {

       bookRepository.save(books);

   }

   public void deleteBooks(Long id) {

       bookRepository.deleteById(id);

   }
    
}
