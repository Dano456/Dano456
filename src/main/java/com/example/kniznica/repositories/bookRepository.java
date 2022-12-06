package com.example.kniznica.repositories;

import java.util.Optional;

import com.example.kniznica.entities.books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends JpaRepository<books,Long>{

    Optional<books> findById(Long Id);
    
    books findByName(String name);
/**toto za DU: */
    //Optional<books> save(books books);
    
}
