package com.ly.springannotation.controller;

import com.ly.springannotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author luoyong
 * @Description: BookController
 * @create 2019-12-28 19:48
 * @last modify by [LuoYong 2019-12-28 19:48]
 **/
@Controller
public class BookController {
    @Autowired(required = false)
    private BookService bookService;

}
