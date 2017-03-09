<%--
  Created by IntelliJ IDEA.
  User: lijunbo
  Date: 2017/3/9
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>我的留言</title>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
    <link href="/static/css/index.css" rel="stylesheet">
</head>
<body>
<%@ include file="/WEB-INF/jsp/common/head.jsp" %>
<div class="row" id="pageContent">
    <div class="col-md-9" id="msaList">
    </div>
    <div class="col-md-3">
        <%@ include file="/WEB-INF/jsp/common/nav.jsp" %>
    </div>
</div>
</body>
</html>
<script type="text/javascript" src="/static/js/myMsa.js">
</script>