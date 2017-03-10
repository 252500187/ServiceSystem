package com.indexSystem.dao.impl;

import com.indexSystem.dao.base.BaseDao;
import com.indexSystem.dao.UserDao;
import com.indexSystem.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

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

    public void addUser(UserInfoVO user) {
        baseDao.getJdbcTemplate().update("INSERT INTO user_info (user_name,password,nick_name,register_time) VALUES (?,?,?,?)",
                user.getUserName(), user.getPassword(), user.getNickName(), baseDao.getDateFormat().format(new Date()));
    }

    public int changePassword(String id, String newPassword, String oldPassword) {
        return baseDao.getJdbcTemplate().update("UPDATE user_info SET password=? WHERE id=? AND password=?", newPassword, id, oldPassword);
    }

    public UserInfoVO getInfo(String id) {
        return baseDao.getJdbcTemplate().queryForObject("SELECT user_name, nick_name FROM user_info WHERE id = ?",
                new BeanPropertyRowMapper<UserInfoVO>(UserInfoVO.class), id);
    }

    public int editInfo(String id, UserInfoVO user) {
        return baseDao.getJdbcTemplate().update("UPDATE user_info SET nick_name=? WHERE id=?", user.getNickName(), id);
    }
}
