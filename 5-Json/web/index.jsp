<%--
  Created by IntelliJ IDEA.
  User: Barcelona
  Date: 2020/4/14
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <script>
    var  user  = {
      age  : 22,
      name : "yzy",
    };
    //将js对象转换成Json
    let json = JSON.stringify(user);

    let parse = JSON.parse(json);

    console.log(parse);
    console.log(json);




  </script>

  </body>
</html>
