package com.ly.springannotation.core;

import com.ly.springannotation.annotation.lookup.LookUpPerson;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author luoyong
 *  * @create 2021-06-13 6:35 下午
 *  * @last modify by [luoyong 2021-06-13 6:35 下午]
 * @Description: BeanDefinitionTest
 **/
public class BeanDefinitionTest {
    public static void main(String[] args) throws IOException {
        test01();
    }

    public static void test01() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        LookUpPerson bean = context.getBean(LookUpPerson.class);
        System.out.println(bean);

    }
}
