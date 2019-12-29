package com.ly.springannotation;

import com.ly.springannotation.bean.Person;
import com.ly.springannotation.config.MainConfig;
import com.ly.springannotation.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;
import java.util.Map;

/**
 * @author luoyong
 * @Description: IOCTest
 * @create 2019-12-28 19:55
 * @last modify by [LuoYong 2019-12-28 19:55]
 **/
public class IOCTest {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);


    /**
     * @param
     * @return void
     * @Description: @Conditional 根据条件注册bean
     * @author luoyong
     * @create 23:07 2019/12/28
     * @last modify by [LuoYong 23:07 2019/12/28 ]
     */
    @Test
    public void test3() {

        //动态获取环境变量的值：Windows 10
        Environment environment = applicationContext.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println("当前环境是：" + property);

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
        Arrays.stream(beanNamesForType).forEach(System.out::println);

        //获取Person.class 类型的所有bean的信息
        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);
        System.out.println(beansOfType);
    }


    /**
     * @param
     * @return void
     * @Description: 测试@Scope和@Lazy
     * @author luoyong
     * @create 23:03 2019/12/28
     * @last modify by [LuoYong 23:03 2019/12/28 ]
     */
    @Test
    public void test2() {
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
     * 测试@ComponentScan 包扫描
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
