package com.indexSystem.service.impl;

import com.indexSystem.dao.UserDao;
import com.indexSystem.dao.impl.UserDaoImpl;
import com.indexSystem.vo.UserInfo;
import com.indexSystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lijunbo on 2017/2/27.
 */
@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private static UserDao userDao;

    public boolean login(String userName, String password) {
        UserInfo userInfo = userDao.getUserInfo(userName);
        if (password.equals(userInfo.getPassword())) {
            return true;
        }
        return false;
    }

    public static UserDao getUserDao() {
        return userDao;
    }

    public static void setUserDao(UserDao userDao) {
        LoginServiceImpl.userDao = userDao;
    }
}
