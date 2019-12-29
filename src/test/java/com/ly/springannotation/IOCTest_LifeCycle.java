package com.ly.springannotation;

import com.ly.springannotation.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 * @Description: IOCTest_LifeCycle
 * @create 2019-12-29 11:44
 * @last modify by [LuoYong 2019-12-29 11:44]
 **/
public class IOCTest_LifeCycle {
    @Test
    public void test01() {
        //1、创建ioc容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成...");
        //关闭容器的时候销毁对象
        applicationContext.close();
    }
}
