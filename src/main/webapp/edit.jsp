<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/28
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/course/update" method="post">
    <input type="hidden" name="_method" value="PUT" />
    <table>
        <tr>
            <td>编号：</td>
            <td>
                <input type="text" name="id" readonly value="${course.id}" />
            </td>
        </tr>
        <tr>
            <td>名称：</td>
            <td>
                <input type="text" name="name" value="${course.name}" />
            </td>
        </tr>
        <tr>
            <td>价格：</td>
            <td>
                <input type="text" name="price" value="${course.price}" />
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
