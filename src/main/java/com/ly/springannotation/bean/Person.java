package com.ly.springannotation.bean;

import lombok.Data;

/**
 * @author luoyong
 * @Description: Person
 * @create 2019-12-28 19:31
 * @last modify by [LuoYong 2019-12-28 19:31]
 **/
@Data
public class Person {
    private String name;
    private Integer age;
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
