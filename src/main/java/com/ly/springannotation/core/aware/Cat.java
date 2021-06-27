package com.ly.springannotation.core.aware;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author luoyong
 *  * @create 2021-06-27 12:17 下午
 *  * @last modify by [luoyong 2021-06-27 12:17 下午]
 * @Description: Cat
 **/
@Component
@Data
public class Cat {
    public Cat() {
        System.out.println("cat被创建了...");
    }

    private String name;
}
