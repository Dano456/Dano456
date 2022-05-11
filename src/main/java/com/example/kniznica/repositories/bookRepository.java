package com.example.kniznica.repositories;

import com.example.kniznica.entities.books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRepository extends JpaRepository<books,Long>{
    
    
}
