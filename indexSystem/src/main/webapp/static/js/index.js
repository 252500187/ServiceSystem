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
                msaList.append('<section class="about section"><div class="section-inner"><h2 class="heading">'
                    + result[i].nickName + '</h2><div class="content"><p>'
                    + result[i].content + '</p><p>'
                    + result[i].time + '</p></div></div></section>');
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