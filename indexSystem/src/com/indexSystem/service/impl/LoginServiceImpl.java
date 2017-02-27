package com.indexSystem.service.impl;

import com.indexSystem.dao.UserDao;
import com.indexSystem.dao.impl.UserDaoImpl;
import com.indexSystem.vo.UserInfo;
import com.indexSystem.service.LoginService;

/**
 * Created by lijunbo on 2017/2/27.
 */
public class LoginServiceImpl implements LoginService {

    private static UserDao userDao = new UserDaoImpl();

    public boolean isLogin(String userName, String password) {
        UserInfo userInfo = userDao.getUserInfo(userName);
        if (password.equals(userInfo.getPassword())) {
            return true;
        }
        return false;
    }
}
