package com.example.goodreads;

import java.util.*;

import com.example.goodreads.BookRepository;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class BookService implements BookRepository {
    private HashMap<Integer, Book> hmap = new HashMap<>();

    public BookService() {
        Book b1 = new Book(1, "Harry Poter", "harry-poter.jpg");
        Book b2 = new Book(2, "Rise", "rise.jpg");
        Book b3 = new Book(3, "Game Of Thorns", "game-of-thorns.jpg");
        Book b4 = new Book(4, "House Of The Dragon ", "house-of-the-dragon");
        Book b5 = new Book(5, "Mahabharata", "mahabharata.jpg");
        Book b6 = new Book(6, "Lord Krishna", "lord-krishna.jpg");
        Book b7 = new Book(7, "Spoken English", "spoken-english.jpg");
        Book b8 = new Book(8, "RRR", "rrr.jpg");
        Book b9 = new Book(9, "Ashok Vikram", "ashok-vikram.jpg");
        Book b10 = new Book(10, "Leo", "leo.jpg");

        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2);
        hmap.put(b3.getId(), b3);
        hmap.put(b4.getId(), b4);
        hmap.put(b5.getId(), b5);
        hmap.put(b6.getId(), b6);
        hmap.put(b7.getId(), b7);
        hmap.put(b8.getId(), b8);
        hmap.put(b9.getId(), b9);
        hmap.put(b10.getId(), b10);
    }

    @Override
    public ArrayList<Book> getBooks() {
        Collection<Book> BookCollection = hmap.values();
        ArrayList<Book> books = new ArrayList<>(BookCollection);
        return books;

    }

    @Override
    public Book getBookById(int bookId) {
        Book book = hmap.get(bookId);
        if (book == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return book;
    }
}