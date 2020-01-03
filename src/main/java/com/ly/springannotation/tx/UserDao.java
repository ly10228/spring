package com.ly.springannotation.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

/**
 * @author luoyong
 * @Description: UserDao
 * @create 2020-01-02 23:01
 * @last modify by [LuoYong 2020-01-02 23:01]
 **/
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void insert() {
        String sql = "INSERT INTO `test`.`user` ( `name`, `account_name`, `email`) VALUES (?,?,?);";
        String name = UUID.randomUUID().toString().substring(0, 5);
        jdbcTemplate.update(sql, name, "001", "001@qq.com");
        int i = 10 / 0;
    }
}
