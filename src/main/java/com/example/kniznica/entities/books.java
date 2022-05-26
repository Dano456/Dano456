package com.example.kniznica.entities;

import java.sql.Date;
import javax.persistence.*;

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

    @Column(name = "author_name")
    private String author_name;

    @Column(name = "borrow_to")
    private Date borrow_to;

    public books () {

    }

    public books(Long id, String name, Integer pages, boolean borrow, String author_name){
        super();
        this.id=id;
        this.name=name;
        this.pages=pages;
        this.borrow=borrow;
        this.author_name=author_name;
    }

    public books(Long id, String name, Integer pages, boolean borrow, String author_name, Date borrow_to){
        super();
        this.id=id;
        this.name=name;
        this.pages=pages;
        this.borrow=borrow;
        this.author_name=author_name;
        this.borrow_to=borrow_to;
    }
    
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
 
    public String getAuthorName(){
        return author_name;
    }

    public void setAuthorName(String author_name){
        this.author_name=author_name;
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

    public Date getBorrowTo(){
        return borrow_to;
    }

    public void setBorrowTo(Date borrow_to){
        this.borrow_to=borrow_to;
    }
    

}
