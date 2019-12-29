package com.ly.springannotation.service;

import com.ly.springannotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoyong
 * @Description: BookService
 * @create 2019-12-28 19:48
 * @last modify by [LuoYong 2019-12-28 19:48]
 **/
@Service
public class BookService {

    /**
     * @Qualifier("bookDao")
     * @Autowired(required=false)
     * @Resource(name="bookDao2")
     * @Inject
     */
    @Autowired
    private BookDao bookDao;


    public void print() {
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}

