package com.ly.springannotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author luoyong
 * @Description: Dog
 * @create 2019-12-29 12:03
 * @last modify by [LuoYong 2019-12-29 12:03]
 **/
@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    public Dog() {
        System.out.println("Dog...constructor...");
    }

    //对象创建并赋值之后调用
    @PostConstruct
    public void init() {
        System.out.println("Dog...init...@PostConstruct...");
    }

    //容器移除对象之前
    @PreDestroy
    public void destroy() {
        System.out.println("Dog ... destroy...@PreDestroy...");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
