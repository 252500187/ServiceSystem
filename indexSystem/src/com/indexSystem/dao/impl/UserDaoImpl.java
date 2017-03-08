package com.indexSystem.dao.impl;

import com.indexSystem.dao.base.BaseDao;
import com.indexSystem.dao.UserDao;
import com.indexSystem.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by lijunbo on 2017/2/27.
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    BaseDao baseDao;

    public UserInfoVO getOnUseUserInfo(String userName) {
        return baseDao.getJdbcTemplate().queryForObject("SELECT id, password FROM user_info WHERE user_name = ? AND state = 1",
                new BeanPropertyRowMapper<UserInfoVO>(UserInfoVO.class), userName);
    }

    public int changePassword(String id, String newPassword, String oldPassword) {
        return baseDao.getJdbcTemplate().update("UPDATE user_info SET password=? WHERE id=? AND password=?", newPassword, id, oldPassword);
    }
}
