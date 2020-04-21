<%--
  Created by IntelliJ IDEA.
  User: Barcelona
  Date: 2020/4/19
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


    <form action="/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="upload">
  </form>

    <a href="/download">点击下载</a>
    <a href="servlet.jpg">点击查看图片</a>
  </body>
</html>
