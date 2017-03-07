$.ajax({
    url: "/msa/showMsa",
    type: "post",
    dataType: "json",
    data: "sta=0&len=30",
    success: function (result) {
        var msaList = $("#msaList");
        for (var i in result) {
            msaList.append('<div class="row"><div class="col-md-12"><div class="panel panel-success"><div class="panel-heading"><h3 class="panel-title">'
                + result[i].nickName + result[i].time + '</h3></div><div class="panel-body">'
                + result[i].content + '</div></div></div></div>');
        }
    }
});