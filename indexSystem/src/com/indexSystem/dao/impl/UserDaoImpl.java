package com.indexSystem.dao.impl;

import com.indexSystem.dao.UserDao;
import com.indexSystem.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import javax.swing.tree.RowMapper;

/**
 * Created by lijunbo on 2017/2/27.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    DriverManagerDataSource datasource;

    JdbcTemplate jdbcTemplate;

    public UserInfo getUserInfo(String userName) {
        return jdbcTemplate.queryForObject("SELECT * FROM user_info WHERE user_name = ?", UserInfo.class, userName);
    }

    public DriverManagerDataSource getDatasource() {
        return datasource;
    }

    public void setDatasource(DriverManagerDataSource datasource) {
        this.datasource = datasource;
    }
}
