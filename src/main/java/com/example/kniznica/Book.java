package com.example.kniznica;

public class Book {

    private String name;

    private String authorName;

    private int pages;

    private boolean borrow;

    public Book (String name, String authorName, int pages, boolean borrow) {
        super();
        this.name = name;
        this.authorName = authorName;
        this.pages = pages;
        this.borrow = borrow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages ;
    }

    public boolean getBorrow() {
        return borrow;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }
    


    
}
