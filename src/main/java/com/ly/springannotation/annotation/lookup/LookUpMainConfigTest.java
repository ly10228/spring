package com.ly.springannotation.annotation.lookup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author luoyong
 * @Description: 测试
 * @create 2019-12-28 19:28
 * @last modify by [LuoYong 2019-12-28 19:28]
 **/


public class LookUpMainConfigTest {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(LookUpMainConfig.class);


        //LookUpCat 是原型模式
        LookUpCat bean1 = applicationContext.getBean(LookUpCat.class);
        LookUpCat bean2 = applicationContext.getBean(LookUpCat.class);

        //false
        System.out.println(bean1 == bean2);


        //LookUpPerson是单例模式
        LookUpPerson person1 = applicationContext.getBean(LookUpPerson.class);
        LookUpCat lookUpCat1 = person1.getLookUpCat();
        LookUpCat1 lookUpCat11 = person1.getLookUpCat1();

        LookUpPerson person2 = applicationContext.getBean(LookUpPerson.class);
        LookUpCat lookUpCat2 = person2.getLookUpCat();
        LookUpCat1 lookUpCat21 = person2.getLookUpCat1();

        //true 因为LookUpPerson是单例的
        System.out.println("lookUpCat1与lookUpCat2比较结果是: " + (lookUpCat1 == lookUpCat2));

        //
        System.out.println("lookUpCat11与lookUpCat21比较结果是: " + (lookUpCat11 == lookUpCat21));


        applicationContext.close();
    }
}

