<%--
  Created by IntelliJ IDEA.
  User: Barcelona
  Date: 2020/4/18
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Login/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit" value="登录">
</form>
</body>
</html>
