package com.indexSystem.dao.impl;

import com.indexSystem.dao.base.BaseDao;
import com.indexSystem.dao.UserDao;
import com.indexSystem.vo.UserInfoVO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by lijunbo on 2017/2/27.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao {

    public UserInfoVO getUserInfo(String userName, int state) {
        return jdbcTemplate.queryForObject("SELECT id, password FROM user_info WHERE user_name = ? AND state = ?",
                new BeanPropertyRowMapper<UserInfoVO>(UserInfoVO.class), userName, state);
    }
}
