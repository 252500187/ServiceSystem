$(".help-block").css("display", "none");

$("#registerBtn").click(function () {
    $("#register_form").css("display", "block");
    $("#login_form").css("display", "none");
});

$("#backBtn").click(function () {
    $("#register_form").css("display", "none");
    $("#login_form").css("display", "block");
});

$("#login").click(function () {
    $(".help-block").css("display", "none");
    var userName = $("#userName");
    var password = $("#password");
    if (userName.val().trim() == "") {
        userName.parent().addClass("has-error");
        userName.next().css("display", "block");
        return;
    }
    if (password.val().trim() == "") {
        password.parent().addClass("has-error");
        password.next().css("display", "block");
        return;
    }
    $.ajax({
        url: "/login",
        type: "post",
        data: {
            userName: userName.val(),
            password: password.val()
        },
        success: function (result) {
            if (result) {
                window.location.href = "/";
            } else {
                password.parent().addClass("has-error");
                password.next().next().css("display", "block");
            }
        }
    });
});

$("#regist").click(function () {
    $(".help-block").css("display", "none");
    var userName = $("#ruserName");
    var password = $("#rpassword");
    var rpassword = $("#rrpassword");
    if (userName.val().trim() == "") {
        userName.parent().addClass("has-error");
        userName.next().css("display", "block");
        return;
    }
    if (password.val().trim() == "") {
        password.parent().addClass("has-error");
        password.next().css("display", "block");
        return;
    }
    if (rpassword.val().trim() == "" || rpassword.val() != password.val()) {
        rpassword.parent().addClass("has-error");
        rpassword.next().css("display", "block");
        return;
    }
    $.ajax({
        url: "/register",
        type: "post",
        contentType: "application/json",
        data: JSON.stringify({
            userName: userName.val(),
            password: password.val(),
            nickName: $("#rnickName").val()
        }),
        success: function (result) {
            if (result) {
                $("#register_form").css("display", "none");
                $("#login_form").css("display", "block");
                $("#registSuccess").css("display", "block");
            } else {
                userName.parent().addClass("has-error");
                userName.next().next().css("display", "block");
            }
        }
    })
    ;
})
;
