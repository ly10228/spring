package com.ly.springannotation.ext;

import com.ly.springannotation.bean.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author luoyong
 * @Description: ExtConfig
 * 扩展原理：
 * BeanPostProcessor：bean后置处理器，bean创建对象初始化前后进行拦截工作的
 * BeanFactoryPostProcessor原理:
 * 1)、ioc容器创建对象
 * 2)、invokeBeanFactoryPostProcessors(beanFactory);
 * 		如何找到所有的BeanFactoryPostProcessor并执行他们的方法；
 * 			1）、直接在BeanFactory中找到所有类型是BeanFactoryPostProcessor的组件，并执行他们的方法
 * 			2）、在初始化创建其他组件前面执行
 *
 * @create 2020-01-04 10:55
 * @last modify by [LuoYong 2020-01-04 10:55]
 **/
@ComponentScan("com.ly.springannotation.ext")
@Configuration
public class ExtConfig {
    @Bean
    public Blue blue() {
        return new Blue();
    }
}
