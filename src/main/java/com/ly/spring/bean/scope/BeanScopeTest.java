package com.ly.spring.bean.scope;

import com.ly.spring.bean.autowire.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luoyong
 *  * @create 2019-12-07 23:22
 *  * @last modify by [luoyong 2019-12-07 23:22]
 * @Description: BeanCreateTest
 **/
public class BeanScopeTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-scope.xml");

        //作用域单例 创建容器的时候就创建好了car对象
        Car car = (Car) applicationContext.getBean("car");
        Car car1 = (Car) applicationContext.getBean("car");
        //比较的是地址值 true 默认是单例的
        System.out.println(car == car1);

        //作用域原型 在获取的时候才去创建对象
        Car car2 = (Car) applicationContext.getBean("car1");
        Car car3 = (Car) applicationContext.getBean("car1");
        //false 不是同一个对象 每次都会创建一个新的对象
        System.out.println(car2 == car3);


    }
}
