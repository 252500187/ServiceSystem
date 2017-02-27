package com.indexSystem.controller;

import com.indexSystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Noce_ on 2017/2/26.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private static LoginService loginService;

    @RequestMapping(value = "/in", method = RequestMethod.GET)
    public String index(){
        if(loginService.login("a","b")){
            return "index";
        }
        return "aa";
    }

    public static LoginService getLoginService() {
        return loginService;
    }

    public static void setLoginService(LoginService loginService) {
        IndexController.loginService = loginService;
    }
}
