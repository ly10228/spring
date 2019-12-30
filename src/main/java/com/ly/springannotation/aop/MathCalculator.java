package com.ly.springannotation.aop;

/**
 * @author luoyong
 * @Description: MathCalculator 业务类
 * @create 2019-12-30 22:44
 * @last modify by [LuoYong 2019-12-30 22:44]
 **/
public class MathCalculator {
    public int div(int i, int j) {
        System.out.println("MathCalculator...div...");
        return i / j;
    }
}
