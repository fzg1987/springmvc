<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/28
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>价格</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="course">
        <tr>
            <td>${course.id}</td>
            <td>${course.name}</td>
            <td>${course.price}</td>
            <td>
                <form action="/course/deleteById/${course.id}" method="post">
                    <input type="hidden" name="_method" value="DELETE" />
                    <input type="submit" value="删除" />
                </form>
                <a href="/course/findById/${course.id}" method="get">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
