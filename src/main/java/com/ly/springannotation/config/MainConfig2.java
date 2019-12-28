package com.ly.springannotation.config;

import com.ly.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author luoyong
 * @Description: MainConfig2
 * @create 2019-12-28 22:38
 * @last modify by [LuoYong 2019-12-28 22:38]
 **/
@Configuration
public class MainConfig2 {

    /**
     * @param
     * @return
     * @Description: @Scope 作用域
     * prototype：多实例的：ioc容器启动并不会去调用方法创建对象放在容器中。每次获取的时候才会调用方法创建对象；
     * singleton：单实例的（默认值）：ioc容器启动会调用方法创建对象放到ioc容器中。以后每次获取就是直接从容器（map.get()）中拿，
     * request：同一次请求创建一个实例
     * session：同一个session创建一个实例
     * @author luoyong
     * @create 22:48 2019/12/28
     * @last modify by [LuoYong 22:48 2019/12/28 ]
     */
    @Bean
//    @Scope("prototype")
    @Scope
    public Person person() {
        System.out.println("往容器当中添加Person....");
        return new Person("张三", 25);
    }
}
