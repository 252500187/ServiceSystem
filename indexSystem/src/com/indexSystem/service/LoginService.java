package com.indexSystem.service;

import org.springframework.stereotype.Service;

/**
 * Created by lijunbo on 2017/2/27.
 */
public interface LoginService {

    public boolean isLogin(String userName, String password);
}
