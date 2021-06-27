package com.ly.springannotation.core.aware;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 *  * @create 2021-06-26 7:52 下午
 *  * @last modify by [luoyong 2021-06-26 7:52 下午]
 * @Description: User
 **/
@Data
@Component
public class UserAware implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //依赖回调机制把ioc容器传入
        this.applicationContext = applicationContext;
    }

    private Long userId;

    private String userName;
}
