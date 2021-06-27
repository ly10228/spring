package com.ly.springannotation.core.factorybean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author luoyong
 * @Description: MainConfig
 * 配置类等于配置文件
 * @create 2019-12-28 19:28
 * @last modify by [LuoYong 2019-12-28 19:28]
 **/
//告诉Spring这是一个配置类
@Configuration
@ComponentScan(value = "com.ly.springannotation.core.factorybean")
public class MainConfig {

}

