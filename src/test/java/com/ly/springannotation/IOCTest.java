package com.ly.springannotation;

import com.ly.springannotation.config.MainConfig;
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


    @SuppressWarnings("resource")
    @Test
    public void test1() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        //获取容器当中所有定义bean的名字
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
