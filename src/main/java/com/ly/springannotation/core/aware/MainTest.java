package com.ly.springannotation.core.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 *  * @create 2021-06-26 7:54 下午
 *  * @last modify by [luoyong 2021-06-26 7:54 下午]
 * @Description: MainTest
 **/
public class MainTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        User user = applicationContext.getBean(User.class);
        //true 直接通过 @Autowired可以获取到ioc容器
        System.out.println(user.getApplicationContext() == applicationContext);
    }
}
