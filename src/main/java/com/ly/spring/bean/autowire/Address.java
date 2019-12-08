package com.ly.spring.bean.autowire;

/**
 * @author luoyong
 *  * @create 2019-12-08 10:52
 *  * @last modify by [luoyong 2019-12-08 10:52]
 * @Description: Address
 **/
public class Address {

    private String city;

    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
