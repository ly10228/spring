package com.ly.springannotation.core.factorybean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 *  * @create 2021-06-26 7:54 下午
 *  * @last modify by [luoyong 2021-06-26 7:54 下午]
 * @Description: MainTest
 **/
public class MainTest {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        HelloFactory helloFactory = applicationContext.getBean(HelloFactory.class);
        System.out.println(helloFactory);
        System.out.println(helloFactory.getObject());
        System.out.println(helloFactory.getObjectType());
    }
}
