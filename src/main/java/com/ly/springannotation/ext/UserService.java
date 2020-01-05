package com.ly.springannotation.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author luoyong
 * @Description: UserService
 * @create 2020-01-05 17:18
 * @last modify by [LuoYong 2020-01-05 17:18]
 **/
@Service
public class UserService {

    @EventListener(ApplicationEvent.class)
    public void listen(ApplicationEvent event) {
        System.out.println("UserService...监听到的事件：" + event);
    }

}
