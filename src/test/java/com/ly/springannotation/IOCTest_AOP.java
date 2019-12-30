package com.ly.springannotation;

import com.ly.springannotation.aop.MathCalculator;
import com.ly.springannotation.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 * @Description: IOCTest_AOP
 * @create 2019-12-30 23:08
 * @last modify by [LuoYong 2019-12-30 23:08]
 **/
public class IOCTest_AOP {
    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator calculator = (MathCalculator) applicationContext.getBean("calculator");
        calculator.div(10, 5);
        applicationContext.close();
    }
}
