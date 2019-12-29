package com.ly.springannotation.bean;

import org.springframework.stereotype.Component;

/**
 * @author luoyong
 * @Description: Car
 * @create 2019-12-29 11:39
 * @last modify by [LuoYong 2019-12-29 11:39]
 **/
@Component
public class Car {
    public Car() {
        System.out.println("car...constructor...");
    }

    public void init() {
        System.out.println("car...init...");
    }

    public void destroy() {
        System.out.println("car ... destroy...");
    }
}

