<%--
  Created by IntelliJ IDEA.
  User: Noce_
  Date: 2017/2/26
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <%@ include file="/WEB-INF/jsp/common/header.jsp" %>
</head>
<body>
<%@ include file="/WEB-INF/jsp/common/head.jsp" %>
<div class="primary col-md-12">
    <div class="row">
        <div class="input-group input-group-lg">
            <span class="input-group-addon" id="sizing-addon1">New</span>
            <input type="text" class="form-control" placeholder="新内容..." aria-describedby="sizing-addon1" id="content">
            <span class="input-group-btn"><button class="btn btn-default" type="button" id="sendNew">发送</button></span>
        </div>
        <hr/>
    </div>
    <div class="row" id="msaList"></div>
    <div class="row">
        <div class="col-md-8 col-md-offset-3">
            <nav aria-label="Page navigation">
                <ul class="pagination">
                    <li>
                        <a aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li><a>1</a></li>
                    <li><a>2</a></li>
                    <li><a>3</a></li>
                    <li><a>4</a></li>
                    <li><a>5</a></li>
                    <li>
                        <a aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/jsp/common/foot.jsp" %>
</body>
</html>
<script src="/static/js/index.js"></script>