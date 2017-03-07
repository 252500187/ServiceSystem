package com.indexSystem.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by lijunbo on 2017/2/27.
 */
public interface UserService {

    public boolean isLogin(HttpSession session, String userName, String password);

    public boolean changePassword(int id, String password);
}
