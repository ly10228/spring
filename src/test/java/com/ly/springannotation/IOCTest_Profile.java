package com.ly.springannotation;

import com.ly.springannotation.bean.Yellow;
import com.ly.springannotation.config.MainConfigOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Arrays;

/**
 * @author luoyong
 * @Description: IOCTest_Profile
 * @create 2019-12-30 22:02
 * @last modify by [LuoYong 2019-12-30 22:02]
 **/
public class IOCTest_Profile {

    /**
     * @param
     * @return void
     * @Description: 切环境
     * 1:使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
     * 2:代码的方式激活某种环境
     * @author luoyong
     * @create 22:18 2019/12/30
     * @last modify by [LuoYong 22:18 2019/12/30 ]
     */
    @Test
    public void test() {
        //1:创建一个ApplicationContext
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //2:设置需要激活的环境
//        applicationContext.getEnvironment().setActiveProfiles("test", "pre", "prd");
        applicationContext.getEnvironment().setActiveProfiles("test");
        //3:注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4:启动刷新容器
        applicationContext.refresh();
//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfProfile.class);
        String[] beanNamesForType = applicationContext.getBeanNamesForType(DataSource.class);
        Arrays.stream(beanNamesForType).forEach(System.out::println);

        Yellow yellow = applicationContext.getBean(Yellow.class);
        System.out.println(yellow);

        applicationContext.close();
    }
}
