var panColor = ["panel-success", "panel-danger", "panel-default", "panel-info", "panel-warning"];

function getMessage(start, length) {
    $.ajax({
        url: "/msa/showMsa",
        type: "post",
        dataType: "json",
        data: {
            sta: start,
            len: length
        },
        success: function (result) {
            var msaList = $("#msaList");
            msaList.empty();
            for (var i in result) {
                msaList.append('<div class="row"><div class="col-md-12"><div class="panel ' + panColor [i % panColor.length] + '"><div class="panel-heading"><h3 class="panel-title">'
                    + result[i].nickName + result[i].time + '</h3></div><div class="panel-body">'
                    + result[i].content + '</div></div></div></div>');
            }
        }
    });
}
$(function () {
    getMessage(0, 30);
});

$("#sendNew").click(function () {
    var content = $("#content").val();
    if (content.trim() == "") {
        alert("内容为空");
        return;
    }
    $.ajax({
        url: "/msa/sendMsa",
        type: "post",
        dataType: "json",
        data: {content: content},
        success: function (result) {
            if (result) {
                $("#content").val("");
                $("#content").attr("placeholder", "发送成功...");
                getMessage(0, 30);
            } else {
                alert("发送失败");
            }
        }
    });
});