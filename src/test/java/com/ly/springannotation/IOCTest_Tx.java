package com.ly.springannotation;

import com.ly.springannotation.tx.TxConfig;
import com.ly.springannotation.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 * @Description: IOCTest_Tx
 * @create 2020-01-02 23:05
 * @last modify by [LuoYong 2020-01-02 23:05]
 **/
public class IOCTest_Tx {
    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);
        userService.insertUser();
        applicationContext.close();
    }
}
