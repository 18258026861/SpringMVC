<%--
  Created by IntelliJ IDEA.
  User: Barcelona
  Date: 2020/4/18
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
<%--    加载静态资源--%>
    <script src="${pageContext.request.contextPath}/static/jquery-3.4.1.js"></script>
  </head>
  <body>
  <script>
    function f(){
    $.post({
      url: "${pageContext.request.contextPath}/a1",
      //键值对
      data:{"name":$("#username").val()},
      //请求成功
      success: function (date) {
        alert(date);
      },
      //请求失败（404，500。。。。）
      error: function () {

      }
    })
    }

  </script>
<%--        失去焦点是发起请求到后台--%>
  用户名：<input type="text" id="username" onblur="f()">
  </body>
</html>
