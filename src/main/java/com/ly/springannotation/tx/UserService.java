package com.ly.springannotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author luoyong
 * @Description: UserService
 * @create 2020-01-02 22:55
 * @last modify by [LuoYong 2020-01-02 22:55]
 **/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void insertUser() {
        userDao.insert();
        //otherDao.other();xxx
        System.out.println("插入完成...");
    }


}
