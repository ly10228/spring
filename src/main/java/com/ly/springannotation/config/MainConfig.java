package com.ly.springannotation.config;

import com.ly.springannotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author luoyong
 * @Description: MainConfig
 * 配置类等于配置文件
 * @create 2019-12-28 19:28
 * @last modify by [LuoYong 2019-12-28 19:28]
 **/
//告诉Spring这是一个配置类
@Configuration
/**
 * @ComponentScan 指定要扫描的包
 * ComponentScan.Filter[] excludeFilters() default {}; :指定扫描的时候按照什么规则排除那些组件
 *  ComponentScan.Filter[] includeFilters() default {};指定扫描的时候需要包含那些组件 默认按照默认的过滤器 扫描所有 这边设置 useDefaultFilters = false
 *  FilterType.ANNOTATION：按照注解
 * FilterType.ASSIGNABLE_TYPE：按照给定的类型；
 * FilterType.ASPECTJ：使用ASPECTJ表达式
 * FilterType.REGEX：使用正则指定
 * FilterType.CUSTOM：使用自定义规则
 */
//@ComponentScan(value = "com.ly.springannotation", excludeFilters = {
//        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class, Service.class}),
//        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Person.class})
//})
@ComponentScan(value = "com.ly.springannotation", includeFilters = {
//        @Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//        @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Person.class}),
        @Filter(type = FilterType.CUSTOM, classes = {MyTypeFilter.class}),
}, useDefaultFilters = false)
public class MainConfig {

    /**
     * 给容器中注册一个Bean;类型为返回值的类型，id默认是用方法名作为id
     */
    @Bean("person")
    public Person person() {
        return new Person("ly", 27);
    }
}

