package com.ly.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author luoyong
 *  * @create 2019-12-08 18:03
 *  * @last modify by [luoyong 2019-12-08 18:03]
 * @Description: ExternalConfFileBeanCreateTest
 **/
public class ExternalConfFileBeanCreateTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-properties.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource);

        DataSource dataSource1 = (DataSource) applicationContext.getBean("dataSource1");
        System.out.println(dataSource1);
    }
}
