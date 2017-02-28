package com.indexSystem.dao.impl;

import com.indexSystem.dao.UserDao;
import com.indexSystem.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.InitBinder;

import javax.swing.tree.RowMapper;

/**
 * Created by lijunbo on 2017/2/27.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao{

    public UserInfo getUserInfo(String userName) {
        return jdbcTemplate.queryForObject("SELECT * FROM user_info WHERE user_name = ?",new BeanPropertyRowMapper<UserInfo>(UserInfo.class), userName);
    }
}
