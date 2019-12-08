package com.ly.spring.bean.autowire;


/**
 * @author luoyong
 *  * @create 2019-12-08 10:52
 *  * @last modify by [luoyong 2019-12-08 10:52]
 * @Description: Person
 **/
public class Person {

    private String name;

    private Address address;

    private Car car;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", car=" + car +
                '}';
    }
}
