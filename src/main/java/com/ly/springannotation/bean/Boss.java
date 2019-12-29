package com.ly.springannotation.bean;

import org.springframework.stereotype.Component;

/**
 * @author luoyong
 * @Description: Boss
 * 默认加在ioc容器中的组件，容器启动会调用无参构造器创建对象，再进行初始化赋值等操作
 * @create 2019-12-29 22:34
 * @last modify by [LuoYong 2019-12-29 22:34]
 **/
@Component
public class Boss {

    private Car car;

    /**
     * @param car
     * @return
     * @Description: 构造器要用的组件，都是从容器中获取
     * 1 @Autowired
     * 2 public Boss(@Autowired Car car)
     * 3 如果当前类只有一个有参构造器@Autowired是可以省略的
     * @author luoyong
     * @create 22:42 2019/12/29
     * @last modify by [LuoYong 22:42 2019/12/29 ]
     */
    public Boss(Car car) {
        this.car = car;
        System.out.println("Boss...有参构造器");
    }


    public Car getCar() {
        return car;
    }


    /**
     * @param car
     * @return void
     * @Description: 标注在方法，Spring容器创建当前对象，就会调用方法，完成赋值
     * 方法使用的参数，自定义类型的值从ioc容器中获取
     * @author luoyong
     * @create 22:36 2019/12/29
     * @last modify by [LuoYong 22:36 2019/12/29 ]
     */
    //@Autowired
    public void setCar(Car car) {
        this.car = car;

    }

    @Override
    public String toString() {
        return "Boss [car=" + car + "]";
    }


}
