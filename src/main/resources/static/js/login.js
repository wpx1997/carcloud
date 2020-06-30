
function loginVerify() {

    var loginName = $("#loginName").val();
    var password = $("#password").val();

    $.ajax({
        type:"POST",
        url: "/login",
        contentType:'application/json',
        data: JSON.stringify({
            "loginName":loginName,
            "password":password
        }),
        success:function (response) {
            if (response.code == 200){
                $.cookie("id",response.data.id);
                alert($.cookie("id"));
                window.location.href=('/');
            }else {
                alert(response.message);
            }
        }
    })


}