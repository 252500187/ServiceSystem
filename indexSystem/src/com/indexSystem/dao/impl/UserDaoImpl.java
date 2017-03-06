package com.indexSystem.dao.impl;

import com.indexSystem.dao.base.BaseDao;
import com.indexSystem.dao.UserDao;
import com.indexSystem.vo.UserInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by lijunbo on 2017/2/27.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao{

    public UserInfo getUserInfo(String userName) {
        return jdbcTemplate.queryForObject("SELECT password FROM user_info WHERE user_name = ?", new BeanPropertyRowMapper<UserInfo>(UserInfo.class), userName);
    }
}
