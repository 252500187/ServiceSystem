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
    <%@ include file="/WEB-INF/jsp/common/header.jsp"%>
</head>
<body>
  <form method="post" action="/login.action">
    <input type="text" name="userName" id="userName">
    <input type="text" name="password" id="password">
    <input type="submit" value="login">
  </form>
</body>
</html>
