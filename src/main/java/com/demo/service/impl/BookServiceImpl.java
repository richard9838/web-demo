package com.demo.service.impl;

import com.demo.dao.BookDao;
import com.demo.entity.Book;
import com.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> listBooks() {
        return bookDao.queryAll(0, 10);
    }
}
