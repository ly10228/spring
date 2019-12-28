package com.ly;

import com.ly.springannotation.bean.Person;
import com.ly.springannotation.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author luoyong
 * @Description: MainTest
 * @create 2019-12-28 19:35
 * @last modify by [LuoYong 2019-12-28 19:35]
 **/
public class MainTest {
    public static void main(String[] args) {
        //注解的方式创建一个bean
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);

        String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
        Arrays.stream(namesForType).forEach(System.out::println);
    }
}
