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
    <title>index</title>
    <%@ include file="/WEB-INF/jsp/index/common/header.jsp" %>
    <style type="text/css">
        body {
            padding: 20px
        }
    </style>
</head>
<body>
<div class="row">
    <div class="col-md-9">
        <div class="row" id="msaList"></div>
        <div class="row">
            <div class="col-md-8 col-md-offset-3">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <li>
                            <a href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li>
                            <a href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    </div>
    <div class="col-md-3">
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-default">
                    <div class="panel-body">
                        <div class="bs-example" data-example-id="simple-nav-stacked">
                            <ul class="nav nav-pills nav-stacked nav-pills-stacked-example">
                                <li role="presentation" class="active"><a href="#"><span
                                        class="glyphicon glyphicon-asterisk"></span> Home</a></li>
                                <li role="presentation"><a href="#"><span class="glyphicon glyphicon-asterisk"></span>
                                    Profile</a></li>
                                <li role="presentation"><a href="#"><span class="glyphicon glyphicon-asterisk"></span>
                                    Messages</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
<script src="/static/js/index.js"></script>