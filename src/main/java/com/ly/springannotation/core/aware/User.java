package com.ly.springannotation.core.aware;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 *  * @create 2021-06-26 7:52 下午
 *  * @last modify by [luoyong 2021-06-26 7:52 下午]
 * @Description: User
 **/
@Data
@Component
public class User {

    @Autowired
    private ApplicationContext applicationContext;

    private Long userId;

    private String userName;
}
