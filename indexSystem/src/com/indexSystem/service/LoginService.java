package com.indexSystem.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * Created by lijunbo on 2017/2/27.
 */
public interface LoginService {

    public boolean isLogin(HttpSession session, String userName, String password);
}
