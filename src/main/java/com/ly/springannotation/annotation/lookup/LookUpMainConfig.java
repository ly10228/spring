package com.ly.springannotation.annotation.lookup;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author luoyong
 * @Description: MainConfig
 * 配置类等于配置文件
 * @create 2019-12-28 19:28
 * @last modify by [LuoYong 2019-12-28 19:28]
 **/
//告诉Spring这是一个配置类
@ComponentScan(basePackages = "com.ly.springannotation.annotation.lookup")
@Configuration
public class LookUpMainConfig {

    /**
     *
     */
    /**
     * @return
     * @Description: 给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
     * @author luoyong
     * @create 11:00 上午 2021/6/13
     * @last modify by [LuoYong 11:00 上午 2021/6/13 ]
     */
//    @Bean
//    public LookUpPerson lookUpPerson() {
//        return new LookUpPerson();
//    }
}

