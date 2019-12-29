package com.ly.springannotation.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 * @Description: Cat
 * @create 2019-12-29 11:56
 * @last modify by [LuoYong 2019-12-29 11:56]
 **/
@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("Cat...constructor....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Cat...destroy....");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat...afterPropertiesSet....");
    }
}
