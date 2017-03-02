package com.indexSystem.controller;

import com.indexSystem.service.LoginService;
import com.indexSystem.system.Dict.LOGIN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * Created by Noce_ on 2017/2/26.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private static LoginService loginService;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(){
        return "welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, @RequestParam("userName") String userName, @RequestParam("password") String password){
        if(loginService.isLogin(userName, password)){
            session.setAttribute(LOGIN.SESSION_USERNAME , userName);
            return "index";
        }
        return "welcome";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    public static LoginService getLoginService() {
        return loginService;
    }

    public static void setLoginService(LoginService loginService) {
        IndexController.loginService = loginService;
    }
}
