package com.ly.springannotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 * @Description: 后置处理器：初始化前后进行处理工作
 * @create 2019-12-29 12:14
 * @last modify by [LuoYong 2019-12-29 12:14]
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization..." + beanName + "=>" + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization..." + beanName + "=>" + bean);
        return bean;
    }
}
