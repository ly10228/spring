package com.ly.springannotation;

import com.ly.springannotation.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 * @Description: IOCTest_Ext
 * @create 2020-01-04 11:04
 * @last modify by [LuoYong 2020-01-04 11:04]
 **/
public class IOCTest_Ext {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);
        applicationContext.close();
    }
}
