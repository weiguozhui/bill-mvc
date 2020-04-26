<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="/bill-web/css/index.css">
    <script src="/bill-web/thrid/jquery-3.4.1.js"></script>
    <script>
        $(document).ready(function () {

            $("#login").click(function () {
                alert("已点击");
                $.ajax({
                    url: "/bill-web/login/login",
                    type: "POST",
                    //timeout:
                    dataType: "text JSON",
                    data: {
                        "data": "login"
                    },
                    success: function (data) {
                        alert("已成功");
                        alert(data.result);
                    },
                    error: function (e) {
                        alert("失败");
                        alert(e);
                    }

                });
            });
        });
    </script>
</head>
<body>
<div id="index-head">
    <h3>某某科技有限公司话单系统</h3>
</div>
<div id="login-info" class="index-class">
    <div id="formdiv" style="float:left">
        <form action="/bill-web/login/login" method="post">
            <table>
                <tr>
                    <td class="td-tx">用户名：</td>
                    <td class="td-input"><input type="text" name="userName"></td>
                    </td>
                </tr>
                <tr>
                    <td class="td-tx">
                        密&nbsp;&nbsp;&nbsp;码：
                    </td>
                    <td class="td-input">
                        <input type="password" name="password">
                    </td>
                </tr>
                <tr>
                    <td class="td-tx">
                        验证码：
                    </td>
                    <td class="td-input">
                        <input type="text" name="authCode">
                    </td>

                </tr>
                <tr>
                    <td colspan="2" id="logn-td">
                        <input id="loginbtn" type="submit" value="登录">
                    </td>
                </tr>
            </table>
        </form>
    </div>
    <div id="imagediv" style="float: left">
        <img type="image" src="/bill-web/auth/code" id="codeImage" style="cursor:pointer;"/>
    </div>
</div>
<%--<div id="div1">--%>
<%--<div id="div1-2">2</div>--%>
<%--<div id="div1-1"></div>--%>

<%--</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>
<%--<div>2</div>--%>
<%--<div>3</div>--%>

</body>
</html>
