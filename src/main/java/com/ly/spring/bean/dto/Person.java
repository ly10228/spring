package com.ly.spring.bean.dto;

/**
 * @author luoyong
 *  * @create 2019-12-07 23:20
 *  * @last modify by [luoyong 2019-12-07 23:20]
 * @Description: Perosn
 **/
public class Person {

    private String name;

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("属性name被赋值为: " + name);
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello: " + this.name);
    }

    public Person() {
        System.out.println("Person类被实例化了.....");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
