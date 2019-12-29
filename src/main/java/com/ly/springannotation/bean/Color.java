package com.ly.springannotation.bean;

/**
 * @author luoyong
 * @Description: Color
 * @create 2019-12-29 10:00
 * @last modify by [LuoYong 2019-12-29 10:00]
 **/
public class Color {
    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public String toString() {
        return "Color [car=" + car + "]";
    }

}
