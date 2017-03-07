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
    <title>welcome</title>
    <%@ include file="/WEB-INF/jsp/index/common/header.jsp" %>
    <style type="text/css">
        body {
            background: url(/static/img/background.jpg) no-repeat;
            font-size: 16px;
        }

        .form {
            background: rgba(255, 255, 255, 0.2);
            width: 400px;
            margin: 100px auto;
        }

        #login_form {
            display: block;
        }

        #register_form {
            display: none;
        }

        .fa {
            display: inline-block;
            top: 27px;
            left: 6px;
            position: relative;
            color: #ccc;
        }

        input[type="text"], input[type="password"] {
            padding-left: 26px;
        }

        .checkbox {
            padding-left: 21px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="form row">
        <form class="form-horizontal col-sm-offset-3 col-md-offset-3" id="login_form" method="post"
              action="/login">
            <h3 class="form-title">私人系统请登陆</h3>

            <div class="col-sm-9 col-md-9">
                <div class="form-group">
                    <i class="fa fa-user fa-lg"></i>
                    <input class="form-control required" type="text" placeholder="用户名" name="userName"
                           autofocus="autofocus" maxlength="20"/>
                </div>
                <div class="form-group">
                    <i class="fa fa-lock fa-lg"></i>
                    <input class="form-control required" type="password" placeholder="密码" name="password"
                           maxlength="8"/>
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
<script type="text/javascript">
    //    $.ajax({
    //        url: "/login.action",
    //        type: "post",
    //        dataType: "json",
    //        data: "userName=呵呵&password=2",
    //        success: function () {
    //            alert(1);
    //        }
    //    });
</script>