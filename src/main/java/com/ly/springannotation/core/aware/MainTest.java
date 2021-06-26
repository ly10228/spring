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


        UserAware userAware = applicationContext.getBean(UserAware.class);
        //true 方式二 implements ApplicationContextAware  如果想要更多的 直接实现XXXAware即可
        System.out.println(userAware.getApplicationContext() == applicationContext);
    }
}
