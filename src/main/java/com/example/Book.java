package com.example;

public class Book {
    public String title;
    public String author;
    public Book() {
        this.title = "No title";
        this.author = "No author";
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}
