var panColor = ["panel-success", "panel-danger", "panel-default", "panel-info", "panel-warning"];

function getMessage(start, length) {
    $.ajax({
        url: "/msa/myMsa",
        type: "post",
        dataType: "json",
        data: {
            sta: start,
            len: length
        },
        success: function (result) {
            var msaList = $("#msaList");
            for (var i in result) {
                msaList.append('<div class="row"><div class="col-md-12"><div class="panel ' + panColor [i % panColor.length] + '"><div class="panel-heading"><h3 class="panel-title">'
                    + result[i].time + (result[i].state == 1 ? '（有效）' : '（无效）') + '</h3></div><div class="panel-body">'
                    + result[i].content + '</div></div></div></div>');
            }
        }
    });
}
$(function () {
    getMessage(0, 30);
});