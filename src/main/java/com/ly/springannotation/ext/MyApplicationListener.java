package com.ly.springannotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 * @Description: MyApplicationListener
 * @create 2020-01-05 16:24
 * @last modify by [LuoYong 2020-01-05 16:24]
 **/
@Component
public class MyApplicationListener implements ApplicationListener<ApplicationEvent> {

    /**
     * @param event
     * @return void
     * @Description: 当容器当中发布此事件以后，方法触发
     * @author luoyong
     * @create 16:25 2020/1/5
     * @last modify by [LuoYong 16:25 2020/1/5 ]
     */
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("MyApplicationListener...收到事件:" + event);
    }
}
