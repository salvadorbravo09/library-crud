package com.sbravoc.services;

import com.sbravoc.entities.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Book saveBook(Book book);
    Book updateBook(Book book);
    List<Book> getBooks();
    Optional<Book> getBookById(Long id);
    void deleteBook(Long id);
}
