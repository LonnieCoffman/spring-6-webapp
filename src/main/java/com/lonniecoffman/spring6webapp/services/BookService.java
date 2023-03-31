package com.lonniecoffman.spring6webapp.services;

import com.lonniecoffman.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();

}
