package com.indexSystem.system.interceptor;

import com.indexSystem.service.UserService;
import com.indexSystem.system.Dict.Dict;
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
    UserService loginService;

    private boolean isAuthorized(String uri, HttpSession session) {
        if ("toLogin".equals(uri) || "login".equals(uri)) {
            return true;
        }
        if (StringUtils.isEmpty(session.getAttribute(Dict.SESSION_USER_ID))) {
            return false;
        }
        return true;
    }

    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        String uri = httpServletRequest.getRequestURI().substring(httpServletRequest.getRequestURI().lastIndexOf("/") + 1);
        if (!isAuthorized(uri, httpServletRequest.getSession())) {
            httpServletRequest.getRequestDispatcher("/toLogin").forward(httpServletRequest, httpServletResponse);
//            httpServletResponse.sendRedirect("/toLogin");
            return false;
        }
        return true;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
