package com.example.kniznica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class books {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "pages")
    private int pages;
    
    @Column(name = "borrow")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private boolean borrow;
    
    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages){
        this.pages=pages;
    }
     
    public boolean getBorrow(){
        return borrow;
    }

    public void setBorrow(boolean borrow){
        this.borrow=borrow;
    }
    

}
