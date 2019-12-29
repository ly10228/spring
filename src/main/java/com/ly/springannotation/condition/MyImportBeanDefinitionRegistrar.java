package com.ly.springannotation.condition;

import com.ly.springannotation.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author luoyong
 * @Description: MyImportBeanDefinitionRegistrar
 * @create 2019-12-29 10:36
 * @last modify by [LuoYong 2019-12-29 10:36]
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * @param importingClassMetadata 当前类的注解信息
     * @param registry               BeanDefinition注册类
     * @return void
     * @Description: 把所有需要添加到容器当中bean：调用BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     * @author luoyong
     * @create 10:36 2019/12/29
     * @last modify by [LuoYong 10:36 2019/12/29 ]
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean blueBean = registry.containsBeanDefinition("com.ly.springannotation.bean.Blue");
        boolean yellowBean = registry.containsBeanDefinition("com.ly.springannotation.bean.Yellow");
        if (blueBean && yellowBean) {
            //指定bean的定义信息
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            //注册一个bean 并指定bean名
            registry.registerBeanDefinition("rainBow", rootBeanDefinition);
        }
    }
}
