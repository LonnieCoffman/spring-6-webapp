package com.lonniecoffman.spring6webapp.services;

import com.lonniecoffman.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();

}
