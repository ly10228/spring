package com.ly.springannotation;

import com.ly.springannotation.bean.Person;
import com.ly.springannotation.config.MainConfig;
import com.ly.springannotation.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author luoyong
 * @Description: IOCTest
 * @create 2019-12-28 19:55
 * @last modify by [LuoYong 2019-12-28 19:55]
 **/
public class IOCTest {

    @Test
    public void test2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        //获取容器当中所有定义bean的名字
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
        System.out.println("IOC容器创建完成");
        //默认作用域是单例的
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
        Person person2 = (Person) applicationContext.getBean("person");
        System.out.println(person2);
        System.out.println(person == person2);

    }


    /**
     * @param
     * @return void
     * @Description: 获取容器当中所有定义bean的名字
     * @author luoyong
     * @create 21:44 2019/12/28
     * @last modify by [LuoYong 21:44 2019/12/28 ]
     */
    @SuppressWarnings("resource")
    @Test
    public void test1() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        //获取容器当中所有定义bean的名字
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
