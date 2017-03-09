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
    <div class="form row">
        <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" method="post"
              action="/login">
            <h3 class="form-title">登陆</h3>

            <div class="col-sm-9 col-md-9">
                <div class="form-group">
                    <i class="fa icon-user"></i>
                    <input class="form-control required" type="text" placeholder="用户名" name="userName" autofocus="autofocus"/>
                </div>
                <div class="form-group">
                    <i class="fa icon-lock"></i>
                    <input class="form-control required" type="password" placeholder="密码" name="password"/>
                </div>
                <%--<div class="form-group">--%>
                <%--<label class="checkbox">--%>
                <%--<input type="checkbox" name="remember" value="1"/> Remember me--%>
                <%--</label>--%>
                <%--<hr/>--%>
                <%--<a href="javascript:;" id="register_btn" class="">Create an account</a>--%>
                <%--</div>--%>
                <div class="form-group">
                    <input type="submit" class="btn btn-success pull-right" value="登陆"/>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>