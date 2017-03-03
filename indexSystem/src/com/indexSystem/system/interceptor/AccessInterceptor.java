package com.indexSystem.system.interceptor;

import com.indexSystem.service.LoginService;
import com.indexSystem.system.Dict.LOGIN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Noce_ on 2017/2/28.
 */
public class AccessInterceptor implements HandlerInterceptor {

    @Autowired
    LoginService loginService;

    private boolean isAuthorized(String uri, HttpSession session) {
        if ("login.action".equals(uri) || "welcome.action".equals(uri)) {
            return true;
        }
        if (StringUtils.isEmpty(session.getAttribute(LOGIN.SESSION_USERNAME))) {
            return false;
        }
        return true;
    }

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI().substring(httpServletRequest.getRequestURI().lastIndexOf("/") + 1);
        if (!isAuthorized(uri, httpServletRequest.getSession())) {
            httpServletResponse.sendRedirect("/welcome.action");
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}