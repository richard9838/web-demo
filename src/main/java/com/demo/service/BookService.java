package com.demo.service;

import com.demo.entity.Book;

import java.util.List;

/**
 *
 */
public interface BookService extends BaseService{

    List<Book> listBooks();

}
