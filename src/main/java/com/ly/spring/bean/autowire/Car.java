package com.ly.spring.bean.autowire;

/**
 * @author luoyong
 *  * @create 2019-12-08 10:55
 *  * @last modify by [luoyong 2019-12-08 10:55]
 * @Description: Car.xml
 **/
public class Car {
    private String brand;

    private float price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car() {
        System.out.println("创建car对象");
    }
}
