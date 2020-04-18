<%--
  Created by IntelliJ IDEA.
  User: Barcelona
  Date: 2020/4/18
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax</title>
    <script src="${pageContext.request.contextPath}/static/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        function x() {
            $.ajax({
                url:"${pageContext.request.contextPath}/user",
                success: function (data) {
                    console.log(data);
                    var html="";

                    for(let i = 0;i < data.length; i++){
                        html += "<tr>" +
                                "<td>" + data[i].name + "<td>" +
                                "<td>" + data[i].age + "<td>" +
                                "<tr>"

                    }
                    $("#context").html(html);
                }
            })
        }
    </script>
</head>
<body>

<input type="button" id="btn" onclick="x()">
<table>
    <tr>
        <td>姓名</td>
        <td>年龄</td>
    </tr>
    <tbody>
    <div id="context"></div>
    </tbody>
</table>

</body>
</html>
