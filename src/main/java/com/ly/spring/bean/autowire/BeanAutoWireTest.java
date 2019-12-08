package com.ly.spring.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luoyong
 *  * @create 2019-12-08 11:01
 *  * @last modify by [luoyong 2019-12-08 11:01]
 * @Description: Bean自动装配测试
 **/
public class BeanAutoWireTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-autowire.xml");

        Address address = (Address) applicationContext.getBean("address");
        System.out.println(address.toString());

        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car.toString());


        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());

        //byName
        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1.toString());

        //byType
        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person2.toString());
    }
}
