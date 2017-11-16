package com.indexSystem.service;

import com.indexSystem.vo.UserInfoVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by lijunbo on 2017/2/27.
 */
public interface UserService {

    public boolean isLogin(HttpSession session, String userName, String password);

    public boolean register(UserInfoVO user);

    public boolean changePassword(String id, String newPassword, String oldPassword);

    public void getSelfInfo(String id, HttpServletRequest request);

    public boolean editInfo(String id, UserInfoVO user);
}
