<%--
  Created by IntelliJ IDEA.
  User: lijunbo
  Date: 2017/3/9
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

</div>
<div class="col-md-3">
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-default">
                <div class="panel-body">
                    <div class="bs-example" data-example-id="simple-nav-stacked">
                        <ul class="nav nav-pills nav-stacked nav-pills-stacked-example">
                            <li role="presentation" id="index"><a href="/"><i class="icon-asterisk"></i> 首页</a></li>
                            <li role="presentation" id="myMsa"><a href="/msa/toMyMsa"><i class="icon-asterisk"></i> 我的留言</a></li>
                            <li role="presentation" id="info"><a href="/toInfo"><i class="icon-asterisk"></i> 个人信息</a></li>
                            <li role="presentation" id="change"><a href="/toChanPass"><i class="icon-asterisk"></i> 修改密码</a></li>
                            <li role="presentation"><a href="/logout"><i class="icon-asterisk"></i> 退出</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
<script type="text/javascript">
    if (document.location.pathname == "/msa/toMyMsa") {
        $("#myMsa").attr("class", "active");
    } else if (document.location.pathname == "/toInfo") {
        $("#info").attr("class", "active");
    } else if (document.location.pathname == "/toChanPass") {
        $("#change").attr("class", "active");
    } else {
        $("#index").attr("class", "active");
    }
</script>