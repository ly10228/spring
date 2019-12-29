package com.ly.springannotation.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author luoyong
 * @Description: 创建一个Spring定义的FactoryBean
 * @create 2019-12-29 10:49
 * @last modify by [LuoYong 2019-12-29 10:49]
 **/
public class ColorFactoryBean implements FactoryBean<Color> {

    /**
     * @param
     * @return
     * @Description: 返回一个Color对象，这个对象会添加到容器中
     * @author luoyong
     * @create 10:52 2019/12/29
     * @last modify by [LuoYong 10:52 2019/12/29 ]
     */
    @Override
    public Color getObject() throws Exception {
        System.out.println("ColorFactoryBean...getObject...");
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * @param
     * @return boolean
     * @Description: 是否是单例的
     * true:bean是单例的 在容器中保存一份
     * false：多实例，每次获取都会创建一个新的bean
     * @author luoyong
     * @create 10:50 2019/12/29
     * @last modify by [LuoYong 10:50 2019/12/29 ]
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
