<%--
  Created by IntelliJ IDEA.
  User: Barcelona
  Date: 2020/4/18
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script src="${pageContext.request.contextPath}/static/jquery-3.4.1.js"></script>

    <script>
        function a() {
            $.ajax({
                url:"${pageContext.request.contextPath}/username",
                //  比如忘了.val
                data:{"username":$("#username").val()},
                success: function (data) {
                    console.log(data);
                    if(data.toString()==='存在'){
                        $("#usernameInfo").css("color","green");
                    }else{
                        $("#usernameInfo").css("color","red");
                    }
                    //   给span标签赋值
                    $("#usernameInfo").html(data);
                }
            })
        };
        function b() {
            $.ajax({
                url:"${pageContext.request.contextPath}/password",
                data:{"password":$("#password").val()},
                success: function (data) {
                    $("#passwordInfo").css("color","red");
                    $("#passwordInfo").html(data);
                }
            })
        }
    </script>
</head>
<body>
<p>
        用户名：<input type="text" id="username" onblur="a()">
        <span id="usernameInfo"></span>
</p>
<p>
        密码：<input type="password" id="password" onblur="b()">
        <span id="passwordInfo"></span>
</p>
</body>
</html>
