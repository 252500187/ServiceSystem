<%--
  Created by IntelliJ IDEA.
  User: Noce_
  Date: 2017/2/28
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
    <link href="/static/css/login.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="form row" id="login_form">
        <div class="form-horizontal col-sm-offset-3 col-md-offset-3">
            <h3 class="form-title">欢迎..</h3>

            <div class="col-sm-9 col-md-9">
                <div class="form-group">
                    <i class="fa icon-user"></i>
                    <input class="form-control required" type="text" placeholder="用户名" id="userName"
                           autofocus="autofocus"/>
                    <span class="help-block">请填写用户名</span>
                </div>
                <div class="form-group">
                    <i class="fa icon-lock"></i>
                    <input class="form-control required" type="password" placeholder="密码" id="password"/>
                    <span class="help-block">请填写密码</span>
                    <span class="help-block">登陆密码错误</span>
                </div>
                <div class="form-group">
                    <hr/>
                    <a href="javascript:;" id="registerBtn">注册</a>
                </div>
                <div class="form-group">
                    <input class="btn btn-success pull-right" id="login" value="登陆" type="button"/>
                </div>
            </div>
        </div>
    </div>
    <div class="form row" id="register_form">
        <div class="form-horizontal col-sm-offset-3 col-md-offset-3">
            <h3 class="form-title">欢迎注册..</h3>

            <div class="col-sm-9 col-md-9">
                <div class="form-group">
                    <i class="fa icon-user"></i>
                    <input class="form-control required" type="text" placeholder="登陆名称" id="ruserName"
                           autofocus="autofocus"/>
                    <span class="help-block">请填写登陆名称</span>
                </div>
                <div class="form-group">
                    <i class="fa icon-magnet"></i>
                    <input class="form-control required" type="text" placeholder="用户昵称" id="rnickName"/>
                </div>
                <div class="form-group">
                    <i class="fa icon-lock"></i>
                    <input class="form-control required" type="password" placeholder="登陆密码" id="rpassword"/>
                    <span class="help-block">请填写登陆密码</span>
                </div>
                <div class="form-group">
                    <i class="fa icon-check"></i>
                    <input class="form-control required" type="password" placeholder="重复密码" id="rrpassword"/>
                    <span class="help-block">两次密码输入不相同</span>
                </div>
                <div class="form-group">
                    <input class="btn btn-info pull-left" id="backBtn" value="返回" type="button"/>
                    <input class="btn btn-success pull-right" id="regist" value="注册" type="button"/>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<script src="/static/js/login.js"></script>