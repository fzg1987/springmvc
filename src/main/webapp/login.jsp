<%--
  Created by IntelliJ IDEA.
  User: fzg1987
  Date: 2022/6/28
  Time: 23:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>学生登录</h1>
    <form:form modelAttribute="student" action="/validate/login" method="post">
        学生姓名：<form:input path="name"></form:input><form:errors path="name" /><br/>
        学生密码：<form:input path="password"></form:input><form:errors path="password" /><br/>
        <input type="submit" value="提交" />
    </form:form>
</body>
</html>
