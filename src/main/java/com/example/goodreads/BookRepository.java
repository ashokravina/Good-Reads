package com.example.goodreads;

import java.util.*;

public interface BookRepository {
    ArrayList<Book> getBooks();

    Book getBookById(int bookId);
}