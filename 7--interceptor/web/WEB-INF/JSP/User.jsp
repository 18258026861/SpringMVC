<%--
  Created by IntelliJ IDEA.
  User: Barcelona
  Date: 2020/4/18
  Time: 23:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
    User界面
</head>
<body>

${sessionScope.username}

<a href="${pageContext.request.contextPath}/Login/quit">退出</a>
</body>
</html>
