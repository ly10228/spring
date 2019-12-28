package com.ly.springannotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @author luoyong
 * @Description: BookDao
 * @create 2019-12-28 19:48
 * @last modify by [LuoYong 2019-12-28 19:48]
 **/
@Repository
public class BookDao {
    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }
}
