package com.ly.springannotation.core.aware;

import lombok.Data;
import org.springframework.beans.BeansException;
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
 **/
@Data
@Component
public class UserAware implements ApplicationContextAware, MessageSourceAware {

    private ApplicationContext applicationContext;

    private MessageSource messageSource;

    @Override
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource=messageSource ;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //依赖回调机制把ioc容器传入
        this.applicationContext = applicationContext;
    }

    private Long userId;

    private String userName;
}
