package com.ly.springannotation.config;

import com.ly.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
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
@Configuration
@ComponentScan(value = "com.ly.springannotation")
public class MainConfig {

    /**
     * 给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
     */
    @Bean("person")
    public Person person() {
        return new Person("ly", 27);
    }
}

