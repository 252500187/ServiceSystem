<%--
  Created by IntelliJ IDEA.
  User: Noce_
  Date: 2017/3/7
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改密码</title>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/jsp/common/head.jsp" %>
<div class="row">
    <div class="col-md-6 col-md-offset-1">
        <div class="form-horizontal">
            <div class="form-group">
                <label for="oldPass" class="col-sm-6 control-label">旧密码</label>

                <div class="col-sm-6">
                    <input type="password" class="form-control" id="oldPass" placeholder="旧密码">
                </div>
            </div>
            <div class="form-group">
                <label for="newPass" class="col-sm-6 control-label">新设密码</label>

                <div class="col-sm-6">
                    <input type="password" class="form-control" id="newPass" placeholder="新设密码">
                </div>
            </div>
            <div class="form-group">
                <label for="newPassAgain" class="col-sm-6 control-label">再次输入</label>

                <div class="col-sm-6">
                    <input type="password" class="form-control" id="newPassAgain" placeholder="再次输入">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-6 col-sm-6">
                    <button type="button" class="btn btn-default" id="chanPass">确认修改</button>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/jsp/common/foot.jsp" %>
</body>
</html>
<script type="text/javascript">
    $("#chanPass").click(function () {
        var oldPass = $("#oldPass").val();
        var newPass = $("#newPass").val();
        if (oldPass == "" || newPass == "") {
            alert("信息错误");
            return;
        }
        if (newPass != $("#newPassAgain").val()) {
            alert("新密码两次输入不相同");
            return;
        }
        $.ajax({
            url: "/chanPass",
            type: "post",
            dataType: "json",
            data: {
                opsd: oldPass,
                npsd: newPass
            },
            success: function (result) {
                if (result) {
                    alert("修改成功");
                } else {
                    alert("修改失败");
                }
            }
        });
    });
</script>