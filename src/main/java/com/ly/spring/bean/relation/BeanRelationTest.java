package com.ly.spring.bean.relation;

import com.ly.spring.bean.autowire.Address;
import com.ly.spring.bean.autowire.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luoyong
 *  * @create 2019-12-07 23:22
 *  * @last modify by [luoyong 2019-12-07 23:22]
 * @Description: BeanCreateTest
 **/
public class BeanRelationTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-relation.xml");

//        Address address = (Address) applicationContext.getBean("address");
//        System.out.println(address);

        Address address1 = (Address) applicationContext.getBean("address1");
        System.out.println(address1);

        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        Person person1 = (Person) applicationContext.getBean("person1");
        System.out.println(person1);

        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println(person2);

    }
}
