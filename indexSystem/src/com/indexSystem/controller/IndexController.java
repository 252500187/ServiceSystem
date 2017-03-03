package com.indexSystem.controller;

import com.indexSystem.service.LoginService;
import com.indexSystem.system.Dict.LOGIN;
import com.indexSystem.vo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "index/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, @RequestParam("userName") String userName, @RequestParam("password") String password){
        if(true || loginService.isLogin(userName, password)){
            session.setAttribute(LOGIN.SESSION_USERNAME , userName);
            return "index/index";
        }
        return "index/welcome";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index/index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.removeAttribute(LOGIN.SESSION_USERNAME);
        return "index/welcome";
    }

    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    @ResponseBody
    public UserInfo ajax() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("¹þ¹þ");
        return userInfo;
    }

    public static LoginService getLoginService() {
        return loginService;
    }

    public static void setLoginService(LoginService loginService) {
        IndexController.loginService = loginService;
    }
}
