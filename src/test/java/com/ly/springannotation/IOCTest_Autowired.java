package com.ly.springannotation;

import com.ly.springannotation.bean.Boss;
import com.ly.springannotation.bean.Car;
import com.ly.springannotation.bean.Color;
import com.ly.springannotation.config.MainConfigOfAutowired;
import com.ly.springannotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 * @Description: bean的自动装配测试
 * @create 2019-12-29 14:13
 * @last modify by [LuoYong 2019-12-29 14:13]
 **/
public class IOCTest_Autowired {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        System.out.println("...bos...");
        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        System.out.println("...color...");
        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
        System.out.println(applicationContext);
        applicationContext.close();

    }
}
