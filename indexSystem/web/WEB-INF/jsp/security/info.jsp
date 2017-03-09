<%--
  Created by IntelliJ IDEA.
  User: lijunbo
  Date: 2017/3/9
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>个人信息</title>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/jsp/common/head.jsp" %>
<div class="row">
    <div class="col-md-6 col-md-offset-1">
        <div class="form-horizontal">
            <div class="form-group">
                <label class="col-sm-6 control-label">用户名</label>

                <div class="col-sm-6">
                    <%=request.getAttribute("userName")%>
                </div>
            </div>
            <div class="form-group">
                <label class="col-sm-6 control-label">昵称</label>

                <div class="col-sm-6">
                    <input class="form-control" id="nick" placeholder="<%=request.getAttribute("nick")%>">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-6 col-sm-6">
                    <button class="btn btn-default" id="editInfo">修改</button>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/jsp/common/foot.jsp" %>
</body>
</html>
<script type="text/javascript">
    $("#editInfo").click(function () {
        var nick = $("#nick");
        if (nick.val() == "" || nick.val() == nick.attr("placeholder")) {
            alert("未修改昵称");
            return;
        }
        $.ajax({
            url: "/editInfo",
            type: "post",
            contentType: "application/json",
            dataType: "json",
            data: JSON.stringify({
                nickName: nick.val()
            }),
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
