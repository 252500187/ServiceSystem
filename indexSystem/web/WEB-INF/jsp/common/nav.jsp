<%--
  Created by IntelliJ IDEA.
  User: Noce_
  Date: 2017/3/7
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-body">
                <div class="bs-example" data-example-id="simple-nav-stacked">
                    <ul class="nav nav-pills nav-stacked nav-pills-stacked-example">
                        <li role="presentation" id="index"><a href="/"><span class="glyphicon glyphicon-asterisk"></span> 首页</a></li>
                        <li role="presentation" id="change"><a href="/toChangePassword"><span class="glyphicon glyphicon-asterisk"></span> 修改密码</a></li>
                        <li role="presentation"><a href="/logout"><span class="glyphicon glyphicon-asterisk"></span> 退出</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript">
    if (document.location.pathname == "toChangePassword") {
        $("#change").attr("class", "active");
    } else {
        $("#index").attr("class", "active");
    }
</script>