package com.ly.springannotation.core.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 *  * @create 2021-06-26 7:52 下午
 *  * @last modify by [luoyong 2021-06-26 7:52 下午]
 * @Description: UserAware  Aware接口；帮我们装配Spring底层的一些组件
 * 1、Bean的功能增强全部都是有 BeanPostProcessor+InitializingBean  （合起来完成的）
 * 2、骚操作就是 BeanPostProcessor+InitializingBean
 * 你猜Autowired是怎么完成的
 * Person为什么能把ApplicationContext、MessageSource当为自己的参数传进来。
 * - 通过实现接口的方式自动注入了 ApplicationContext、MessageSource。是由BeanPostProcessor（Bean的后置处理器完成的）
 **/
@Component
public class UserAware implements ApplicationContextAware, MessageSourceAware {

    private ApplicationContext applicationContext;

    private MessageSource messageSource;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //依赖回调机制把ioc容器传入
        this.applicationContext = applicationContext;
    }

    public UserAware() {
        System.out.println("invoke-->UserAware构造器");
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    private Long userId;

    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private Cat cat;

    @Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat getCat() {
        return cat;
    }
}
