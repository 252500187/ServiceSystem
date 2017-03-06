package com.indexSystem.controller;

import com.indexSystem.service.LoginService;
import com.indexSystem.system.Dict.Dict;
import com.indexSystem.vo.UserInfoVO;
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
    private LoginService loginService;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "index/welcome";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, @RequestParam("userName") String userName, @RequestParam("password") String password) {
        if (loginService.isLogin(session, userName, password)) {
            return "index/index";
        }
        return "index/welcome";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index/index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute(Dict.SESSION_USERNAME);
        session.removeAttribute(Dict.SESSION_USER_ID);
        return "index/welcome";
    }

    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    @ResponseBody
    public UserInfoVO ajax() {
        UserInfoVO userInfoVO = new UserInfoVO();
        userInfoVO.setUserName("¹þ¹þ");
        return userInfoVO;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
}
