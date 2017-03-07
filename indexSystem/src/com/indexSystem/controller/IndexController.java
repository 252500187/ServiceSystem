package com.indexSystem.controller;

import com.indexSystem.service.UserService;
import com.indexSystem.system.Dict.Dict;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by Noce_ on 2017/2/26.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
    public String welcome(HttpSession session) {
        session.removeAttribute(Dict.SESSION_USERNAME);
        session.removeAttribute(Dict.SESSION_USER_ID);
        return "security/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpSession session,
                        @RequestParam("userName") String userName, @RequestParam("password") String password) {
        if (userService.isLogin(session, userName, password)) {
            return "index";
        }
        return "security/login";
    }

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute(Dict.SESSION_USERNAME);
        session.removeAttribute(Dict.SESSION_USER_ID);
        return "security/login";
    }

    @RequestMapping(value = "/toChanPass", method = RequestMethod.GET)
    public String toChangePassword() {
        return "security/chanpass";
    }

    @RequestMapping(value = "/chanPass", method = RequestMethod.POST)
    @ResponseBody
    public boolean changePassword(HttpSession session, @RequestAttribute("psd") String password) {
        int id = Integer.parseInt((String) session.getAttribute(Dict.SESSION_USER_ID));
        if (userService.changePassword(id, password)) {
            return true;
        }
        return false;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
