package com.ly.springannotation.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author luoyong
 * @Description: User
 * @create 2019-12-28 19:31
 * @last modify by [LuoYong 2019-12-28 19:31]
 **/
@Data
public class Person {
    @Value("ly")
    private String name;
    @Value("#{20-2}")
    private Integer age;
    @Value("${person.nickName}")
    private String nickName;

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }
}
