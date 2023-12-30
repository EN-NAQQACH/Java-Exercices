package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMain {
    public static void main(String[] args) {
        // Initialize the Spring ApplicationContext from the beans.xml file
        ApplicationContext context = new ClassPathXmlApplicationContext("Library.xml");

        // Retrieve beans from the context
        Book book = (Book) context.getBean("book1");
        Reader reader = (Reader) context.getBean("reader1");
        Library library = (Library) context.getBean("library");

        // Print information
        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Book Author: " + book.getAuthor());

        System.out.println("Reader Name: " + reader.getName());

        System.out.println("Library Books: " + library.getBooks());
        System.out.println("Library Readers: " + library.getReaders());
    }
}
