package com.indexSystem.service.impl;

import com.indexSystem.dao.UserDao;
import com.indexSystem.system.Dict.Dict;
import com.indexSystem.system.Utils;
import com.indexSystem.vo.UserInfoVO;
import com.indexSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by lijunbo on 2017/2/27.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private static UserDao userDao;

    public boolean isLogin(HttpSession session, String userName, String password) {
        UserInfoVO userInfoVO = userDao.getOnUseUserInfo(userName);
        if (userInfoVO != null && Utils.getMD5(password).equals(userInfoVO.getPassword())) {
            session.setAttribute(Dict.SESSION_USERNAME, userName);
            session.setAttribute(Dict.SESSION_USER_ID, userInfoVO.getId());
            return true;
        }
        return false;
    }

    public boolean changePassword(String id, String newPassword, String oldPassword) {
        try {
            if (userDao.changePassword(id, newPassword, oldPassword) > 0) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }

    public static UserDao getUserDao() {
        return userDao;
    }

    public static void setUserDao(UserDao userDao) {
        UserServiceImpl.userDao = userDao;
    }
}
