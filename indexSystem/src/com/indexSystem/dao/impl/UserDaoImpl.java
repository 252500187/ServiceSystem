package com.indexSystem.dao.impl;

import com.indexSystem.dao.UserDao;
import com.indexSystem.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.swing.tree.RowMapper;

/**
 * Created by lijunbo on 2017/2/27.
 */
public class UserDaoImpl implements UserDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public UserInfo getUserInfo(String userName) {
        return jdbcTemplate.queryForObject("SELECT * FROM user_info WHERE user_name = ?", UserInfo.class, userName);
    }
}
