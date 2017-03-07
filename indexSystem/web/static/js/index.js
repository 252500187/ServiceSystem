$.ajax({
    url: "/msa/showMsa",
    type: "post",
    dataType: "json",
    data: "sta=0&len=30",
    success: function (result) {
        console.log(result);
    }
});