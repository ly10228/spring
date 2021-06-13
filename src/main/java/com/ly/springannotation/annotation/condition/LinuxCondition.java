package com.ly.springannotation.annotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author luoyong
 * @Description: LinuxCondition
 * @create 2019-12-28 23:13
 * @last modify by [LuoYong 2019-12-28 23:13]
 **/
public class LinuxCondition implements Condition {
    /**
     * @param context  判断条件能使用的上下文
     * @param metadata 注释信息
     * @return boolean
     * @Description: 是否linux系统
     * @author luoyong
     * @create 23:14 2019/12/28
     * @last modify by [LuoYong 23:14 2019/12/28 ]
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //1:能获取到ioc使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2:获取类的加载器
        ClassLoader classLoader = context.getClassLoader();
        //3:获取当前环境
        Environment environment = context.getEnvironment();
        //4:获取到bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        String property = environment.getProperty("os.name");
        //可以判断容器当中bean注册的情况 也可以给容器当中注册bean
        boolean definition = registry.containsBeanDefinition("person");
        if (property.contains("linux")|| property.contains("Mac")){
            return true;
        }
        return false;
    }
}
